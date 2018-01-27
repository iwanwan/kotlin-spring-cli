import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
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
      SpringApplication.run(KotlinSpringCliApplication::class.java, *args)
    }
  }
}