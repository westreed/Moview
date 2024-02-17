# Moview 프로젝트

## 계획

[Velog 링크](https://velog.io/@westreed/%EB%AA%A8%EB%B7%B0-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-24.01.29)

## 프로젝트 빌드

1. git clone
2. 환경변수 등록
```bash
# 컴퓨터 환경변수
MYSQL_PASSWORD=비밀번호
```
3. .env 파일 생성 및 변수 등록
```bash
# .env
MYSQL_PASSWORD=비밀번호
```
3. 프로젝트 루트폴더에서 `docker-compose up -d --build` 실행