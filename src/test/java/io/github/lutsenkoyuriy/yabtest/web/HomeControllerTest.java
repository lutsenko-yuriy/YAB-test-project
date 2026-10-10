package io.github.lutsenkoyuriy.yabtest.web;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

  @Value("${local.server.port}")
  private int port;

  @Test
  void homePageShowsAliveMessage() throws Exception {
    HttpResponse<String> response =
        HttpClient.newHttpClient()
            .send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/")).GET().build(),
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

    assertThat(response.statusCode()).isEqualTo(200);
    MediaType contentType =
        MediaType.parseMediaType(response.headers().firstValue("Content-Type").orElseThrow());
    assertThat(contentType.isCompatibleWith(MediaType.TEXT_PLAIN)).isTrue();
    assertThat(contentType.getCharset()).isEqualTo(StandardCharsets.UTF_8);
    assertThat(response.body())
        .isEqualTo("I am somehow alive! Thank you, Yuriy's agentic boyz!");
  }
}
