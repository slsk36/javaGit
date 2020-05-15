# javaGit
java Git 실습
   
    
# git 처음 연동
1. git init // 로컬 저장소 생성
2. git status // 어떤 파일들이 변경 추가 삭제 되었는지 확인
3. git remote add origin https://github.com/slsk36/javaGit.git //저장소 연결
(git remote remove origin)//기존 저장소 제거
4. git remote -v //현재 저장소 확인해보기
5. git add . //변경된 파일 staging상태로 변경
6. git commit -m 'commit message' //커밋
7. git push -u origin master // 푸쉬
(git push -u origin +master 강제푸쉬)
※ 오류발생시 git pull 명령어로 원격저장소와 로컬저장소 상태 
