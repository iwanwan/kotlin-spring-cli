package integration

import KotlinSpringCliApplication
import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.springframework.boot.test.rule.OutputCapture

class KotlinSpringCliApplicationTests{

  @Rule
  @JvmField
  val outputCapture = OutputCapture()

  @Test
  fun runApplication() {
    val app = KotlinSpringCliApplication()
    app.run("")

    val output = this.outputCapture.toString()
    assertThat(output).contains("halo dunia")
    assertThat(output).contains("halo semua")
  }

}