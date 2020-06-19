# javaGit
java Git 실습
   
    
# git 처음 연동
1. git init  // 로컬 저장소 생성
2. git status  // 어떤 파일들이 변경 추가 삭제 되었는지 확인
3. git remote add origin https://github.com/slsk36/javaGit.git  //저장소 연결
>(git remote remove origin)  //기존 저장소 제거
4. git remote -v  //현재 저장소 확인해보기
5. git add .  //변경된 파일 staging상태로 변경
6. git commit -m 'commit message'  //커밋
7. git push -u origin master  // 푸쉬
>(git push -u origin +master 강제푸쉬)
>>※ 오류발생시 git pull 명령어로 원격저장소와 로컬저장소 상태 맞춰주기

# git clone사용
1. git clone https://github.com/slsk36/javaGit.git  //내 컴퓨터에 깃 원격저장소 가져오기
2. 에러 발생시 cd 명령어로 git 파일이 있는 저장소로 들어가기 
3. git status 와  git remote -v로 현재 상태확인후 절차대로 

# git push시에 failed to push some refs to 에러
1. 일단 git pull을 해준다.
2. 에러1) refusing to merge unrelated histories
3. 에러2) Please specify which branch you want to merge with.
4. 해결법) git branch 로 현재 branch조회해본다
5. git branch --set-upstream-to=origin/master master로 branch를 추적하게 한다.
6. 그래도 git pull했을때  refusing to merge unrelated histories 에러 발생하면
7. git pull origin master --allow-unrelated-histories 하여 다른 두 로컬 저장소를 묶어버린다
8. vi편집창이 뜨면 :q!로 저장하지 않고 빠져나온다
9. 다시 git pull 해보고 이미 업데이트 되있다는 메시지 뜨면 push 해볼것   

