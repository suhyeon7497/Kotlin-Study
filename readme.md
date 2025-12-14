## 📘 2. Kotlin 언어 핵심 복습 (백엔드 관점)
### 📗 2.1 함수형 스타일 이해
- [x] 📙 고차 함수와 람다
- [x] 📒 inline 함수, closure, it 키워드 활용
- [x] 📒 scope 함수 (let, apply, with, run, also) 실전 사용


### 📗 2.2 Null Safety 완전 정복
- [x] 📙 nullable 타입과 safe call
- [x] 📒 Elvis 연산자, !! 연산자 사용 시점
- [x] 📒 null 관련 예외 상황 실습


### 📗 2.3 데이터 중심 언어 기능
- 📙 데이터 클래스
- 📒 copy, destructuring, toString, equals 자동화
- 📙 Sealed Class & Enum Class
- 📒 상태 분기 처리와 패턴 매칭 스타일


## 📘 3. Kotlin 백엔드 프레임워크 개요
### 📗 3.1 Spring Boot + Kotlin
- 📙 Kotlin DSL로 설정하는 Spring Boot
- 📒 Controller, Service, Repository 기본 패턴
- 📒 REST API 빠르게 만들기


### 📗 3.2 Ktor 프레임워크
- 📙 코루틴 기반 논블로킹 서버
- 📒 라우팅 DSL, 모듈화 방식
- 📒 JSON 직렬화, 오류 처리 미들웨어
- 📙 Ktor + Exposed(DB 연동), Auth 설정


### 📗 3.3 기타 대안 프레임워크
- 📙 Micronaut, Vert.x, Javalin 간단 비교
- 📒 어느 상황에서 어떤 걸 쓰는지


### 📘 4. 웹 API 설계와 RESTful 구축
- 📗 4.1 RESTful API 기본 원칙
- 📙 HTTP 메서드와 URL 디자인
- 📒 명사 기반 URI, 상태 코드 명확히 쓰기


### 📗 4.2 요청 처리 흐름
- 📙 Controller → Service → Repository 흐름
- 📒 DTO와 도메인 모델 분리


### 📗 4.3 Validation 처리
- 📙 Spring에서 @Valid와 예외 처리
- 📒 Global Exception Handler 구축


## 📘 5. 데이터베이스 연동 및 ORM 활용
### 📗 5.1 관계형 DB 연동
- 📙 H2, PostgreSQL 설정
- 📒 application.yml에서 DB 설정 분리


### 📗 5.2 JPA vs Exposed (ORM 비교)
- 📙 Kotlin 친화적 ORM - Exposed
- 📒 DAO vs DSL 방식
- 📒 트랜잭션 처리, 쿼리 최적화


### 📗 5.3 마이그레이션 도구
- 📙 Flyway, Liquibase 사용법
- 📒 버전 기반 DB 스키마 관리 전략


## 📘 6. 인증과 보안
### 📗 6.1 JWT 인증 처리
- 📙 Access Token, Refresh Token 발급 및 저장 전략
- 📒 Token 검증 필터, 만료 처리


### 📗 6.2 OAuth 연동
- 📙 Kakao, Google, Github OAuth 연동
- 📒 토큰 → 사용자 DB 등록 플로우


### 📗 6.3 보안 기초
- 📙 CORS 설정, HTTPS 적용
- 📒 XSS, CSRF, SQL Injection 방어


## 📘 7. 실시간 및 비동기 통신
### 📗 7.1 웹소켓 처리
- 📙 Ktor의 WebSocket DSL
- 📒 클라이언트 인증 & 메시지 브로드캐스트


### 📗 7.2 Kotlin Coroutine 활용
- 📙 백그라운드 작업 비동기 처리
- 📒 delay, launch, async, withContext 차이


### 📗 7.3 이벤트 기반 설계
- 📙 Kafka, Redis Pub/Sub 간단 연동
- 📒 메시지 프로듀서/컨슈머 설계


## 📘 8. 파일 처리 및 이미지 업로드
### 📗 8.1 Multipart 기반 파일 처리
- 📙 8.1.1 Multipart 요청 파싱 및 저장
- 📒 @RequestPart, MultipartFile 사용법

- 📒 로컬 디스크/서버 디렉토리 저장 방식

#### 📙 8.1.2 파일 형식 및 크기 검증
- 📒 MIME Type 체크
- 📒 파일 크기 제한 및 예외 처리



### 📗 8.2 외부 스토리지 연동 (S3, GCP 등)
#### 📙 8.2.1 AWS S3 업로드 구현
- 📒 S3 Client 설정, 버킷 정책 구성
- 📒 프리사인 URL 방식 업로드

#### 📙 8.2.2 GCP Storage 연동
- 📒 GCP 자격 증명 설정
- 📒 버킷 생성 및 객체 업로드 API 사용



## 📘 9. 테스트 작성 (단위, 통합, MockK, TestContainer)
###📗 9.1 단위 테스트 기초
#### 📙 9.1.1 JUnit5 테스트 구성
- 📒 테스트 구조 (Given-When-Then)
- 📒 @Test, @BeforeEach, @Nested 활용

#### 📙 9.1.2 MockK을 활용한 목 객체 주입
- 📒 mockk, every {}, verify {} 기본 사용
- 📒 @MockK, @InjectMockKs 활용법

### 📗 9.2 통합 테스트 작성
#### 📙 9.2.1 SpringBootTest 환경 구성
- 📒 @SpringBootTest 설정
- 📒 DB 초기화, Context 캐시 주의

#### 📙 9.2.2 TestContainer 활용
- 📒 Docker 기반 테스트 DB 컨테이너 띄우기
- 📒 PostgreSQL, Redis, Kafka TestContainer 설정



### 📗 9.3 Rest API 테스트
#### 📙 9.3.1 WebTestClient & MockMvc
- 📒 요청/응답 검증 및 JSON Path 매칭
- 📒 인증 토큰 포함 테스트



## 📘 10. 배포 & 운영 (Docker, CI/CD, Cloud)
### 📗 10.1 Docker 컨테이너화
#### 📙 10.1.1 Dockerfile 작성
- 📒 Kotlin 기반 Gradle 프로젝트 빌드
- 📒 multi-stage build 적용

#### 📙 10.1.2 Docker Compose 구성
- 📒 DB, Redis, Kafka 등 외부 서비스 연동
- 📒 .env 환경 변수 관리



### 📗 10.2 CI/CD 구성
#### 📙 10.2.1 GitHub Actions를 이용한 자동화
- 📒 PR 시 테스트 / 배포 트리거 구성
- 📒 환경별 배포 Job 분리

#### 📙 10.2.2 Jenkins, CircleCI 소개
- 📒 Jenkins Pipeline 작성 기초
- 📒 CircleCI 워크플로우 구성 실습



### 📗 10.3 클라우드 배포
#### 📙 10.3.1 AWS EC2에 직접 배포
- 📒 SSH, Systemd, Nginx 설정 
#### 📙 10.3.2 AWS Elastic Beanstalk / ECS
- 📒 Docker 기반 이미지 업로드 & 운영 
#### 📙 10.3.3 Railway, Render, Fly.io 등 간편 PaaS 비교


## 📘 11. 성능 최적화 및 로깅
### 📗 11.1 로깅 전략 수립
#### 📙 11.1.1 Logback 설정 및 MDC 활용
- 📒 요청 ID 트래킹, 예외 로그 정리
#### 📙 11.1.2 ELK(Elasticsearch + Logstash + Kibana) 구성
- 📒 Filebeat → Logstash → Elasticsearch → Kibana 흐름 이해


### 📗 11.2 메모리 & GC 튜닝
#### 📙 11.2.1 JVM 메모리 구조 이해
- 📒 Heap/Stack, GC 종류 및 차이
- 📒 GC 로그 분석 방법

#### 📙 11.2.2 JDK Flight Recorder 사용


### 📗 11.3 API 성능 개선
#### 📙 11.3.1 N+1 문제 해결
- 📒 JPA Fetch Join, QueryDSL 활용
#### 📙 11.3.2 캐싱 전략
- 📒 Redis를 이용한 read 캐싱
- 📒 Spring Cache Manager 설정



## 📘 12. 대규모 서비스 구조 설계 (Hexagonal, Clean Arch, 모듈화)
### 📗 12.1 모놀리식 → 모듈화 구조 변환
####📙 12.1.1 모듈별 분리 기준 (도메인/기능 기준)
####📙 12.1.2 Gradle 멀티 모듈 구성법


### 📗 12.2 Clean Architecture 적용
#### 📙 12.2.1 UseCase, Port/Adapter 정의
#### 📙 12.2.2 계층 간 의존성 방향 통제 (의존성 역전)


### 📗 12.3 Hexagonal Architecture
#### 📙 12.3.1 Inbound / Outbound Adapter 개념
#### 📙 12.3.2 Controller, Repository, External API 역할 분리


### 📗 12.4 이벤트 기반 아키텍처
#### 📙 12.4.1 Kafka 도입 배경과 구조
#### 📙 12.4.2 Producer / Consumer 패턴 설계
#### 📙 12.4.3 Dead Letter Queue 처리 전략


### 📘 13. Kotlin 백엔드 실전 프로젝트 예제 (게시판, 채팅, 쇼핑몰 등)
#### 📗 13.1 게시판 프로젝트
#### 📙 13.1.1 CRUD API 설계 및 DB 모델링
#### 📙 13.1.2 인증, 댓글, 검색 기능 구현
#### 📙 13.1.3 JPA + QueryDSL 실전 적용


### 📗 13.2 실시간 채팅 서비스
#### 📙 13.2.1 WebSocket 기반 채팅 서버 구현
#### 📙 13.2.2 사용자 세션, 메시지 브로드캐스팅 처리
#### 📙 13.2.3 Redis Pub/Sub + Kafka 확장형 구조


### 📗 13.3 쇼핑몰 백엔드
#### 📙 13.3.1 상품, 카트, 주문, 결제 도메인 설계
#### 📙 13.3.2 결제 API 연동 (토스페이, 아임포트)
#### 📙 13.3.3 관리자 페이지 기능 API 구현
