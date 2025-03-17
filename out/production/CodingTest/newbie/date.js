/*서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
채점 서버는 시간대(Timezone)는 UTC+0 이다.

다음은 채점 서버에서 KST 시간으로 2018년 3월 21일 오후 2시 7분 38초에 date 명령어를 실행시킨 결과이다.

Wed Mar 21 05:07:38 UTC 2018
*/
const now = new Date(new Date().setHours(new Date().getHours() + 9));
const YYYY = now.getFullYear();
const MM = (now.getMonth() + 1).toString().padStart(2, 0);
const DD = now.getDate();
console.log(`${YYYY}-${MM}-${DD}`);