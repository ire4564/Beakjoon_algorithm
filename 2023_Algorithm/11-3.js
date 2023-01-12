function getTimestampsByDescription(xml, description) {
  parser = new DOMParser();
  let result = [];

  const xmlDoc = parser.parseFromString(xml, "text/html");

  const eventEle = xmlDoc.getElementsByTagName("event");

  for (let i = 0; i < eventEle.length; i++) {
    const innerText =
      eventEle[i].getElementsByTagName("description")[0].innerHTML;
    if (innerText === description) {
      result.push(eventEle[i].getAttribute("timestamp"));
    }
  }

  return result;
}

var xmlData = `<?xml version="1.0" encoding="UTF-8"?>
  <log>
    <event timestamp="1614285589">
      <description>Intrusion detected</description>
    </event>
    <event timestamp="1614286432">
      <description>Intrusion ended</description>
    </event>
  </log>`;

var timestamps = getTimestampsByDescription(xmlData, "Intrusion ended");
console.log(timestamps == undefined ? timestamps : timestamps.join());
