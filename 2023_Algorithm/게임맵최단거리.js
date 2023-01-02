function solution(maps) {
  const n = maps.length;
  const m = maps[0].length;
  const visit = maps;
  const dx = [-1, 1, 0, 0];
  const dy = [0, 0, -1, 1];
  let count = 1;
  let queue = [];

  queue.push([0, 0]);
  visit[0][0] = 0;

  while (queue.length > 0) {
    let size = queue.length;

    for (let i = 0; i < size; i++) {
      let [x, y] = queue.shift();

      for (let j = 0; j < 4; j++) {
        const nx = x + dx[j];
        const ny = y + dy[j];

        if (nx >= 0 && nx < n && ny >= 0 && ny < m && visit[nx][ny] === 1) {
          if (nx == n - 1 && ny == m - 1) {
            return (count += 1);
          }
          queue.push([nx, ny]);
          visit[nx][ny] = 0;
        }
      }
    }
    count += 1;
  }

  return -1;
}
