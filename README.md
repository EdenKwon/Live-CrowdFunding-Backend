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
| 팀장 | 팀원 | 침원 | 팀원 |
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

https://crofle.store/
도메인으로도 접속이 가능합니다.
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

- 프론트엔드 :  Github-Flow 전략을 채택하였고 main, feature 브랜치를 사용하였습니다.
    - 빠른 변화 및 테스트를 위하여 채택
      
- 백엔드: Git-Flow 전략을 채택하였고 main, develop, feature, (release, hotfix) 브랜치를 사용하였습니다.
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

## 5. 프로젝트 기간

### WBS

![image](https://github.com/user-attachments/assets/37920ee3-148d-4db1-a467-09bc3668be82)


<br>

## 6. 구현 기능 ------------------------------------------------------------- 여기서 이어 작성하기

#### 사용자


#### 관리자


[상세 기능](https://velog.io/@ybinn99/2%EC%B0%A8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%9D%98%EC%95%BDWMS-%EC%9E%85%EA%B3%A0-%ED%8C%8C%ED%8A%B8-%EA%B8%B0%EB%8A%A5)
해당 링크에서 입고 상세 기능을 확인하실 수 있습니다.

<br>

## 7. 트러블 슈팅

- [조회 시 null 리턴 이슈](https://velog.io/@ybinn99/%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85-ResultMap)

- [다중 쿼리 Update 불가 이슈](https://velog.io/@ybinn99/%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85-Bulk-Update)

<br>

## 8. 개선 목표

- 예외 처리
    - 우선 데이터를 웹으로 정확하게 전달을 우선시 하다보니 예외 처리를 제대로 하지 못하였습니다. 이 부분을 개선할 예정입니다.
- 동시성 처리
    - 하나의 입고 요청서에 대해 사용자와 창고 관리자가 접근하여 발생하는 문제에 대해 해결할 예정입니다.
    - service 트랜잭션 처리 및 mod_date를 통한 판별 등을 통해 처리할 예정입니다.

<br>

## 9. 관련 링크
[ERD](https://www.erdcloud.com/d/E6iQPxSRmuLZqKYCT)

[입고 유스케이스&플로우 차트](https://app.diagrams.net/#G1QmsZ-x5EELIP1d87eztQus2YOxYP_jqr#%7B%22pageId%22%3A%22tBj_1GJiwpTEB6AQOSF3%22%7D)

## 10. 프로젝트 후기 및 회고록

우선 단순히 WMS를 구축하는 것 뿐만이 아니라 의약품 창고에 대한 WMS를 설계했다는 점이 이번 프로젝트의 핵심이었습니다. 단순 물류 시스템을 뛰어넘어 의약, 제약 분야에 대한 관심을 웹 서비스로 나타낼 수 있어 좋았습니다. 구현에 있어 아쉬움은 많았지만 웹 서비스를 처음 구축했다는 점에 의의를 두고 차차 리팩토링하는 과정을 거쳐 성장해 나가겠습니다. 최종 프로젝트에서도 의미있는 프로젝트를 바탕으로 사용자 친화적 서비스를 제공하도록 하겠습니다.

[2차 프로젝트 회고록](https://velog.io/@ybinn99/%EC%8B%A0%EC%84%B8%EA%B3%84-%EC%95%84%EC%9D%B4%EC%95%A4%EC%94%A8-2%EC%B0%A8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%ED%9A%8C%EA%B3%A0%EB%A1%9D)
