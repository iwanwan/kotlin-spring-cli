import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootConfiguration
class KotlinSpringCliApplication : CommandLineRunner {

  override fun run(vararg args: String?) {
    println("halo dunia")
    println("halo semua")
  }

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      SpringApplicationBuilder(KotlinSpringCliApplication::class.java)
              .bannerMode(Banner.Mode.OFF)
              .run(*args)
    }
  }
}