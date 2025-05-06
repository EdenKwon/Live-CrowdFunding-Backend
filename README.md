![image](https://github.com/user-attachments/assets/df8f1d5b-30fa-4c73-b19c-0009c1a5aeff)

# CROFLE CROWD FUN README


<br>

## 팀명 소개

- CROFLE 
- CRowd + Fun + LE
- 신뢰성있고 재미있는 상품들을 제공하는 크라우드 펀딩 서비스

<br>

## 프로젝트 소개 및 주제 선정 이유

- 크라우드 펀딩이란? -> SNS를 이용해 소규모의 후원을 받거나 투자 등의 목적으로 다수의 개인들로부터 자금을 모으는 행위
- 크라우드 펀딩 시스템의 문제점으로 펀딩 사기 등의 신뢰성 문제가 발생
- 사용자에게 신뢰성 및 흥미 요소를 추가적으로 제공하기 위해 기존 시스템에 라이브 스트리밍을 결합한 웹 서비스를 기획
- 라이브 스트리밍을 통한 판매자 <-> 사용자 간 실시간 양방향 소통을 제공하고자 함

<br>

## 팀원 구성 및 소개

<div align="center">

| **EdenKwon** | **AAA** | **BBB** | **CCC** |
| :------: |  :------: | :------: | :------: |
| 팀장 | 팀원 | 팀원 | 팀원 |
| 메인 페이지, 마이 페이지 | 로그인, 프론트엔드 | 라이브 스트리밍, 채팅 | 결제, 관리자 페이지(대시보드) |


</div>
<br>

## 0. 설치하기
프론트엔드 : https://github.com/ssg-ic-project/Live-CrowdFunding-Frontend <br>
백엔드 : https://github.com/ssg-ic-project/Live-CrowdFunding-Backend

```
npm install
```
```
npm run dev
```

<br>

## 1. 개발 환경
![image](https://github.com/user-attachments/assets/1d4a43d4-0dda-4251-b792-b4c34e8bf103)

- Front : HTML5, CSS3, JavaScript(ES6), Vue3
- Back-end : Java(17), Spring Boot(3.3.4), JPA(Hibernate), Spring Security, JUnit5, MySQL(8.0.21), Docker, Redis
- 형상관리 : Github, Git
- 개발도구 : IntelliJ, Visual Studio, Mysql Workbench
- 협업도구 : Notion, Slack, Google Docs, Google Sheet, Zoom
<br>

## 2. 서버 아키텍처
![image](https://github.com/user-attachments/assets/29d937cf-83a2-411e-a5cf-29e8a580cb92)

 <br> 

## 3. 브랜치 전략 및 컨벤션


#### Git-Flow 
<img src="https://github.com/user-attachments/assets/fdb36828-a420-44bf-a740-9410a9dbe84e" height=300px>

- 프론트엔드 :  Github-Flow 전략을 채택하였고 main, feature 브랜치를 사용
    - 빠른 변화 및 테스트를 위하여 채택
      
- 백엔드: Git-Flow 전략을 채택하였고 main, develop, feature, (release, hotfix) 브랜치를 사용
    - 명확한 브랜치 구분을 통한 안정적 배포 프로세스 구축을 위하여 채택
    - release, hotfix는 배포 초기 단계라 활용 x
<br>

#### 네이밍 컨벤션
- 변수 및 메서드명: camel Case
- 클래스명: Pascal Case
- 패키지 및 테이블 컬럼명: snake case

## 4. 프로젝트 구조
<img src="https://github.com/user-attachments/assets/49e0d0f0-718e-4b29-a734-f15179e30434" height=200px>

<br>

## 5. 협업 방식
![image](https://github.com/user-attachments/assets/ce8a4cbf-aaee-442c-975c-423a16fca96c)
Notion 및 Slack 활용

<br>

## 6. 프로젝트 기간

### WBS

![image](https://github.com/user-attachments/assets/37920ee3-148d-4db1-a467-09bc3668be82)


<br>

## 7. 핵심 구현 기능

https://github.com/user-attachments/assets/0f7c57a7-7104-47cd-967b-3f414ea99df0
- 프로젝트(펀딩) 등록
  - 프로젝트 등록 시 메이커는 1차(AI), 2차(관리자) 검토를 거쳐야만 프로젝트 등록이 가능
  - 1차 검토 시 AI가 상품 기획서, 펀딩 기획서를 검토하게 되고 기본적인 프로젝트 정보에 대한 검토가 이루어 짐
  - AI 검토 기준은 다음과 같고, 내부 검토 기준 80점 미만 시 반려 사유 제공
  <img src="https://github.com/user-attachments/assets/df3d41e5-603a-41fe-a765-66dfd349abaa" height=300px>
 
  <br>
[상세 기능](https://velog.io/@ybinn99/%EC%B5%9C%EC%A2%85-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EA%B5%AC%ED%98%84-%EA%B8%B0%EB%8A%A5)
해당 링크에서 상세 기능 구현을 확인하실 수 있습니다.

<br>

## 8. 트러블 슈팅

- [예약 시스템 비관적 락 적용 이슈](https://velog.io/@ybinn99/%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85-%EC%98%88%EC%95%BD-%EC%8B%9C%EC%8A%A4%ED%85%9C-%EB%8F%99%EC%8B%9C%EC%84%B1-%EC%A0%9C%EC%96%B4)

- [엔티티 설계 후 N+1 문제](https://velog.io/@ybinn99/%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85-%EC%97%94%ED%8B%B0%ED%8B%B0-%EC%84%A4%EA%B3%84-%ED%9B%84-N1-%EB%AC%B8%EC%A0%9C)

<br>

## 9. 개선 목표

- 상품 상세 설명 이미지 
    - 현재 상품 상세 설명 이미지를 입력 받을 때 긴 하나의 이미지를 받고 있음
    - 이미지 용량 문제, 메이커의 불편 경험 존재
    - 이미지 압축 알고리즘 적용 및 여러 이미지를 받는 로직으로 변경 예정
- 라이브 방송 STATUS
    - 급하게 로직을 변경함에 따라 라이브 방송 여부에 따른 상태 값을 ENUM이 아닌 숫자로 처리하고 의미를 부여
    - ENUM으로 상태를 수정하고 그에 따른 로직 변경 예정

<br>

## 10. 관련 링크
[ERD](https://www.erdcloud.com/d/KYPmJkkarumbWEtCu)

[Notion](https://short-measure-b6e.notion.site/4-12630b3d969f808894eed78fea456c01?pvs=4)

## 11. 프로젝트 후기 및 회고록

라이브 크라우드 펀딩은 사용자의 흥미를 얼마나 이끌어내는 지가 정말 중요한 요소입니다. 
라이브 방송의 트래픽 증가는 곧 해당 펀딩의 인기를 뜻합니다. 고로 방송 시청 관련 데이터를 축적하여 유용한 데이터로 가공하고 우리의 서비스에 적용한다면 더욱 강력하고 인기있는 프로젝트가 될 것이라고 생각합니다.


팀 프로젝트 협업 면에서는 너무나 만족스러웠습니다. 일정 관리, 역할 분담, 의사소통 모두 잘 이루어졌습니다. 
서투르지만 팀장으로서 팀 분위기를 잘 만들고 싶었고, 만족스러운 결과물을 만들어 내고 싶었습니다.
팀원 분들 전부 큰 갈등없이 제 역할을 다 해주셔서 좋은 결과물을 만들어 낸 것 같습니다. 모두 감사합니다.

