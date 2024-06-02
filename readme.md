## preview 환경 구축

## 사용 기술
- argoCD
- github action
- spring boot
- kotlin

## 예상 동작 flow
1. 코드 작업을 해서 PR을 생성한다.
2. PR라면 변경 내역이 commit 될 때마다 preview 환경을 업데이트 한다. (최초 1회는 생성을 진행한다)
3. preview 환경에서 테스트가 종료되면 merge 한다.
4. branch가 삭제되면 관련 preview 환경도 같이 삭제된다.

## 참고자료
- [Argo CD | dynamic environments for pull requests using application set](https://www.youtube.com/watch?v=LkBBPnG9QO0)
