# Spring webflux

## Mono
## Flux
```
curl -X GET http://localhost:8080/hello/mono
```

## Flux
```
curl -X GET http://localhost:8080/hello/flux   \
-H 'accept: text/event-stream'   \
-H 'cache-control: no-cache'   \
-H 'content-type: text/event-stream'
```