import React, { useState, useEffect } from "react";

const USERS_URL = "https://example.com/api/users";

export default function Table() {
  const [isLoaded, setLoaded] = useState(false);
  const [listItems, setListItems] = useState([]);
  const [lastPageIndex, setLastPageIndex] = useState(0);
  const [pageIndex, setPageIndex] = useState(0);

  const callApi = (index) => {
    const response = fetch(`${USERS_URL}?page=${index}`);
    return response.then((res) => res.json());
  };

  const getList = async (index) => {
    setLoaded(false);
    try {
      const res = await callApi(index);
      setListItems(res.results);
      setLastPageIndex(parseInt(res.count / 10));
    } catch (e) {
      console.log(e);
    }
    setLoaded(true);
  };

  const checkDisabled = (type) => {
    if (isLoaded) {
      if (type === "first" || type === "previous") {
        return pageIndex === 0 ? true : false;
      } else if (type === "next" || type === "last") {
        return pageIndex === lastPageIndex ? true : false;
      }
    } else {
      return true;
    }
  };

  useEffect(() => {
    getList(pageIndex);
  }, [pageIndex]);

  return (
    <div>
      <table className="table">
        <thead>
          <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
          </tr>
        </thead>
        <tbody>
          {listItems.length !== 0 &&
            listItems.map((item) => {
              return (
                <tr>
                  <td>{item.id}</td>
                  <td>{item.firstName}</td>
                  <td>{item.lastName}</td>
                </tr>
              );
            })}
        </tbody>
      </table>
      <section className="pagination">
        <button
          className="first-page-btn"
          disabled={checkDisabled("first")}
          onClick={() => setPageIndex(0)}
        >
          first
        </button>
        <button
          className="previous-page-btn"
          disabled={checkDisabled("previous")}
          onClick={() => setPageIndex(pageIndex - 1)}
        >
          previous
        </button>
        <button
          className="next-page-btn"
          disabled={checkDisabled("next")}
          onClick={() => setPageIndex(pageIndex + 1)}
        >
          next
        </button>
        <button
          className="last-page-btn"
          disabled={checkDisabled("last")}
          onClick={() => setPageIndex(lastPageIndex)}
        >
          last
        </button>
      </section>
    </div>
  );
}
