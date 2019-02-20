# spring-async-example

Steps

1) @EnableAsync in a configuration class(@SpringBootApplication class would do)

2) Mark the async method as @Async

3) Make sure to have the @Async method in a different class than the calling class.
