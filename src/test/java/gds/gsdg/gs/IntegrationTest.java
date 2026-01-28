package gds.gsdg.gs;
import gds.gsdg.gs.config.EmbeddedKafka;

import gds.gsdg.gs.HolaaaaaApp;
import gds.gsdg.gs.config.AsyncSyncConfiguration;
import gds.gsdg.gs.config.EmbeddedSQL;
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
@SpringBootTest(classes = {HolaaaaaApp.class, AsyncSyncConfiguration.class})
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
