package gfds.gdfsg.sd;
import gfds.gdfsg.sd.config.EmbeddedKafka;

import gfds.gdfsg.sd.HolaJhipsterApp;
import gfds.gdfsg.sd.config.AsyncSyncConfiguration;
import gfds.gdfsg.sd.config.EmbeddedSQL;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = {HolaJhipsterApp.class, AsyncSyncConfiguration.class})
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
