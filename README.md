
<p align="center">
 <img width="250px;" src="https://user-images.githubusercontent.com/72757829/114306905-615df500-9b18-11eb-80dc-e1bfc0a8e33c.png" />
  <br/>코스메틱 추천 서비스 💄 
  <p align="center">
 <img src="https://img.shields.io/badge/PostCSS----green?logo=PostCSS">
     <img src="https://img.shields.io/badge/JavaScript-ES6+-green?logo=javascript">
     <img src="https://img.shields.io/badge/React.js-v17.0.1-green?logo=react">
     <img src="https://img.shields.io/badge/ReactRouter-v5-green?logo=react-router"><br/>
     <img src="https://img.shields.io/badge/python-v3.6-blue?logo=python">
     <img src="https://img.shields.io/badge/Java-v1.8-blue?logo=java">
     <img src="https://img.shields.io/badge/Spring Boot-v3.9.15-blue?logo=spring">
     <img src="https://img.shields.io/badge/AWS%20EC2----blue?logo=awsec2">
     <img src="https://img.shields.io/badge/AWS%20RDS----blue?logo=awsrds">
     <img src="https://img.shields.io/badge/MySQL-v8.0-blue?logo=mysql">
     <img src="https://img.shields.io/badge/Django-v3.1.7-blue?logo=django">
  </p>
<br/>  
<br/> 
</p>  

> 서비스명: Será       
> 팀명: 장코   
> 개발 기간: 2021.02.22 ~ 2021.04.09 (약 7주)        

### 🎬 프로젝트 소개영상
https://youtu.be/Jcv6Phk9I3I

<br/>

### 📃문서  
> [기획 문서](https://www.notion.so/PJT-2a4c024fa30c4c919aee328b7e09e64c)   
> [1️⃣SubPJT_기획문서](https://www.notion.so/dovvn/Sub1-13498659a2844ee39995e24f63ee4558), [2️⃣SubPJT_학습 및 개발기본 문서](https://www.notion.so/Sub2-6c68ef0be53645c7bc32051b72655781), [3️⃣SubPJT3_심화 및 마무리 문서](https://www.notion.so/Sub3-9809c183f48346e4aa94df8c34cccb75)      

<br/>




## 📑 서비스개요      
* **사회현상**
  > 1. 코로나 현상으로 마스크가 불가피 해지면서 피부관리와 화장품 성분에 관심이 높아졌다.  
  >
  > 2. 자신의 피부타입을 알지 못하고 단순한 리뷰로만 구매하여 실패하는 사례가 많다.  
  >
  > 3. 자신의 퍼스널컬러를 잘 알지 못한다.      
  >
  > 4. 자기관리가 필수화 된 사회이다.     

위와 같은 사회현상으로 인해 고민이 들어난 남녀노소 모든 사용자를 대상으로 `피부타입`에 따른 설명, `좋은 성분과 피해야하는 성분`, 좋은 성분이 들어간 상품들을 `추천`받을 수 있다.   
더불어 `퍼스널컬러` 진단 후 뷰티팁, 어울리는 색상을 추천받고 다른 유저들이 올린 `리뷰`를 통해 신뢰도 높은 화장품 정보를 제공 받을 수 있다.   


<br/>


## 👨 팀원 역할

| 팀원   | 역할 | 비고                                          |
| ------ | ---- | --------------------------------------------- |
| 김지형 | 팀장 | 프론트엔드 개발, GIT마스터        |
| 백정현 | 팀원 | 백엔드 개발, QA(Jira관리), 로고 디자인        |
| 유진이 | 팀원 | 프론트엔드 테크리더, QA(Jira관리), UX/UI 디자인       |
| 정다운 | 팀원 | 풀스택 개발, UX/UI 디자인 |
| 정혜지 | 팀원 | 백엔드 테크리더, 테스트 시나리오 작성                   |


<br/>


## 📑 주요 기능  
* **회원가입/로그인 기능**  
  > a. 사용자 회원정보를 받아 핸드폰 인증 후 회원가입에 성공한다.  
  >
  > b. 이외 간편 SNS로그인(카카오톡)으로 별도 인증 없이 빠르게 로그인할 수 있다.  
  >
  > c. 가입 후 최초 로그인 시 피부진단 페이지로 이동한다.  
* **피부진단 테스트 기능**  
  > a. 바우만 피부타입 분석 프로세스 기반으로 20가지의 설문문항으로 구성된 테스트를 진행한다.
  >
  > b. 만약, 본인의 피부타입을 이미 알고 있는 경우 skip하여 피부타입을 직접 선택할 수 있다.
  >
  > c. 16가지로 분류된 본인의 피부타입을 기반으로 본인의 피부에 맞는/맞지 않는 성분들을 확인하고 제품을 추천받을 수 있다.  
* **퍼스널컬러 진단 기능**
  > a. 본인의 사진을 업로드하여 퍼스널컬러(4가지)를 진단받을 수 있다.
  >
  > b. 진단 결과 페이지에서는 본인 퍼스널컬러에 대한 설명과 뷰티팁, 어울리는 색상을 확인할 수 있다.
* **상품 기능**
  > a. 상품 페이지에서는 전체, 맞춤, 스킨케어, 메이크업, 향수, 남성 등 카테고리별로  필터링하여 화장품 리스트를 확인할 수 있다. 
  >
  > b. 본인의 피부타입이 진단된 후, "맞춤" 탭에서 맞는 제품 또는 안맞는 제품 리스트를 제공한다.  
  >
  > c. 상품 이미지에서는 본인의 피부타입에 따라 "잘 맞아요/보통이에요/맞지 않아요" 3가지로 색상과 문구가 구분되어 표시된다.
  >
  > d. 인기순, 가격 낮은 순, 가격 높은 순, 리뷰 개수 순으로 상품 리스트를 정렬 할 수 있다.  
  >
  > e. 상품 상세 페이지에서는 상품 상세 정보를 확인하고, 네이버 쇼핑검색으로 최저가를 확인할 수 있습니다.  
  >
  > f. 성분보기를 누르면 나의 피부타입과의 일치여부에 따라 3가지 등급(안전/보통/위험)으로 나누어 현재 상품의 전 성분을 확인할 수 있다.
  >
  > g. 관련 상품을 사용한 유튜버들의 영상을 최신순으로 감상할 수 있으며, 바로 재생이 가능하다. 
  >
  > h. 하단에는 사용자들이 직접 작성한 리뷰의 리스트, 평점, 리뷰 차트를 확인할 수 있고 작성/수정/삭제가 가능하다.  
  >
  > i. 작성한 리뷰의 포토리뷰만 모아서 확인할 수 있고,  작성한 사용자의 연령대와 피부타입도 알 수 있어 나와 비슷한 사람의 리뷰 정보를 얻을 수 있다.  
  >
  > j. 도움이 된 리뷰는 좋아요 할 수 있다.  
* **찜하기기능**
  > a. 상품 리스트, 상세, 검색결과 페이지에서 원하는 상품을 찜하기 할 수 있다.  
  >
  > b. 찜한 상품들은 "내 찜 목록"페이지에서 모아 확인할 수 있다.  
* **검색 기능**
  > a. 카테고리 별로 상품 이름을 검색가능하다.   
  > 
  > b. 검색 결과 페이지에서는 상품명/성분명으로 검색 결과를 확인할 수 있다.
* **마이페이지 기능**
  > a. 마이페이지에서 가입시 입력한 본인 정보를 수정할 수 있다.   
  >  
  > b. 진단받은 피부타입과 퍼스널컬러 유형을 직접 선택해서 수정할 수 있다.   
  >  
  > c. 피부타입탭에서 본인의 피부타임에 관한 설명을 확인할 수 있다.   
  >  
  > d. 퍼스널컬러 탭에서 본인의 퍼스털컬러에 대한 설명을 확인할 수 있다.   


<br/>



## 📑 Gantt Chart

![gantt1](https://user-images.githubusercontent.com/59414210/114440259-e0c8f280-9c04-11eb-8dc2-f26af5b33ffc.png)  
![gantt3](https://user-images.githubusercontent.com/59414210/114440265-e1618900-9c04-11eb-83a2-d483c5709ab4.png)  
![gantt2](https://user-images.githubusercontent.com/59414210/114440266-e1fa1f80-9c04-11eb-81b9-b8c4740ec5ec.png)  


<br/>



## ✔Branch 규칙  
```bash
develop/feature/기능명  
```



<br/>




## ✔Code Style
| FrontEnd   | BackEnd |
| ------ | ---- |
| 1. 폴더명: 첫글자 대문자<br/>→ ex) Feed/Add.vue <br/><br/>2. 파일명: 첫글자 대문자 <br/> → ex) Add.vue <br/><br/>3. 경로명: 소문자 → ex) /add | 1. 클래스명:  첫글자 대문자 + camel case <br/> ex) MainController.java <br/><br/> 2. 함수, 변수: 첫글자 소문자 + camel case <br/> ex) public void setUserName(); |
- if문
    - 한줄 일 때, Block 처리하기
    - else if / else /중괄호는 조건문 바로 옆에 붙이기

    ```java
    if(condition){
     statement;
    } else if(condition2){
     statement2;
    } else{
     statement3;
    }
    ```

- for
  
    - 단순 반복문은 iterator를 i,j,k,...,z순으로 명명하기
- 주석 상대방이 이해할 수 있도록 달기
    - /**/ 설명 여러줄 필요할 때 코드 위에 작성
    - // 간단한 주석 코드 옆에 작성


<br/>


<br/>




## ✔프로젝트 구조  
![프로젝트구조](https://user-images.githubusercontent.com/72757829/114307081-0678cd80-9b19-11eb-81ee-c47da47a2a0d.png)


<br/>




## 💻 주요 기능 미리보기    
![서비스소개](https://user-images.githubusercontent.com/72757829/114307163-5a83b200-9b19-11eb-8ee3-d579cadc5b93.png)

### 1. 메인 화면           

![녹화_2021_04_13_03_24_40_190](https://user-images.githubusercontent.com/59414210/114442751-dcea9f80-9c07-11eb-8b50-63cb75deb1dc.gif)  
![녹화_2021_04_13_03_25_00_81](https://user-images.githubusercontent.com/59414210/114442754-de1bcc80-9c07-11eb-97a6-03a50ac13bbc.gif)  
메인화면에서는 핵심 기능인 피부 진단, 맞춤 화장품 추천, 퍼스널컬러 진단 기능을 원페이지 스크롤로 구현하고 있습니다.  


### 2. 피부 진단  
- 테스트하러가기     
![image46](https://user-images.githubusercontent.com/72757829/114307281-e09ff880-9b19-11eb-8b89-52764703521e.gif)
- Skip
![image47](https://user-images.githubusercontent.com/72757829/114307297-eeee1480-9b19-11eb-9e87-aae871df8e8c.gif)

피부진단 페이지에서는 16문항의 설문테스트 후 본인의 피부타입 결과를 확인할 수 있습니다.  
만약, 설문을 하지 않고 스킵하여 본인의 피부타입을 바로 선택할 수도 있습니다.  
결고 페이지에서는 피부타입에 맞는 성분과 맞지 않는 성분이 소개되며, 피부타입에 맞는 성분으로 구성된 제품을 추천해줍니다.  


### 3. 퍼스널컬러 진단
![image54](https://user-images.githubusercontent.com/72757829/114307337-1c3ac280-9b1a-11eb-85d4-4eaee17b4bbd.gif) 

본인의 사진을 업로드하여 퍼스널컬러를 확인하고 이와 관련된 뷰티팁, 컬러리스트를 추천받을 수 있습니다.  


### 4. 상품 기능
- 상품리스트     
![image48](https://user-images.githubusercontent.com/72757829/114307362-42f8f900-9b1a-11eb-9866-8bd86f11cc12.gif)

- 상품디테일(상품상세)     
![녹화_2021_04_13_04_09_08_417](https://user-images.githubusercontent.com/59414210/114448027-04dd0180-9c0e-11eb-98f4-c92f5e9dc043.gif)
![녹화_2021_04_13_04_07_17_701](https://user-images.githubusercontent.com/59414210/114447904-dfe88e80-9c0d-11eb-9f1d-2214ec60830b.gif)  
![녹화_2021_04_13_04_07_50_281](https://user-images.githubusercontent.com/59414210/114447908-e0812500-9c0d-11eb-99a9-efa03f0d08e1.gif)  


- 상품디테일(리뷰)     
![image53](https://user-images.githubusercontent.com/72757829/114307376-5015e800-9b1a-11eb-94c8-af84fc7fd6d6.gif)


상품 페이지에서는 전체 상품 리스트를 확인할 수 있고, 카테고리에 따라 분류하여 볼 수 있습니다.  
상품마다 본인의 피부타입에 맞는지 문구와 색상으로 구분하여 표시되며, 인기순, 리뷰순으로 정렬하여 볼 수 있습니다.  
상품 상세 페이지에서는 상품에 대한 소개와 관련 유튜브 영상으로 이동이 가능하며, 사용자들이 작성한 리뷰를 제공합니다.  



<br/>



# 📑산출물  
> 1. ER 다이어그램     
> 2. 와이어프레임   


##  💄 ER 다이어그램   
![erd](https://user-images.githubusercontent.com/72757829/114307027-cc0f3080-9b18-11eb-9475-726774581049.png)


---


<br/>



### 💄 와이어프레임
![슬라이드1](https://user-images.githubusercontent.com/72757829/114306985-af72f880-9b18-11eb-860c-d2dd8856631e.png)
![슬라이드2](https://user-images.githubusercontent.com/72757829/114306987-b0a42580-9b18-11eb-91eb-0cb4c7a56a49.PNG)
![슬라이드3](https://user-images.githubusercontent.com/72757829/114306989-b0a42580-9b18-11eb-8704-bb7ac29044f3.PNG)
![슬라이드4](https://user-images.githubusercontent.com/72757829/114306990-b13cbc00-9b18-11eb-84ce-9843ff50c437.PNG)
![슬라이드5](https://user-images.githubusercontent.com/72757829/114306991-b1d55280-9b18-11eb-9eec-a6b5af286b0e.PNG)
![슬라이드6](https://user-images.githubusercontent.com/72757829/114306992-b1d55280-9b18-11eb-8de2-fd2120cbba0e.PNG)
![슬라이드7](https://user-images.githubusercontent.com/72757829/114306993-b26de900-9b18-11eb-9b77-523a74cddaea.PNG)
![슬라이드8](https://user-images.githubusercontent.com/72757829/114306994-b26de900-9b18-11eb-99e7-956a972decdb.PNG)
![슬라이드9](https://user-images.githubusercontent.com/72757829/114306995-b3067f80-9b18-11eb-8d33-2eacb48eedf9.PNG)
![슬라이드10](https://user-images.githubusercontent.com/72757829/114306996-b3067f80-9b18-11eb-8a88-4199663d2ee3.PNG)
![슬라이드11](https://user-images.githubusercontent.com/72757829/114306997-b39f1600-9b18-11eb-89ef-5820d2e0e3a6.PNG)
![슬라이드12](https://user-images.githubusercontent.com/72757829/114306999-b39f1600-9b18-11eb-85e1-707e38dae8e2.png)
![슬라이드13](https://user-images.githubusercontent.com/72757829/114307001-b437ac80-9b18-11eb-8d8f-9c2476d169f8.PNG)
![슬라이드14](https://user-images.githubusercontent.com/72757829/114307003-b437ac80-9b18-11eb-837a-663042c9b528.PNG)
![슬라이드15](https://user-images.githubusercontent.com/72757829/114307004-b4d04300-9b18-11eb-8b47-8b4d5ce4d57e.PNG)
![슬라이드16](https://user-images.githubusercontent.com/72757829/114307005-b4d04300-9b18-11eb-95f9-ab377fa4296b.PNG)


## 💡 프로젝트 회고


## Awards
-  

