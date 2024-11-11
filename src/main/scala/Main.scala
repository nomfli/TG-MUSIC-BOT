import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.bot4s.telegram.api.TelegramBot
import com.bot4s.telegram.clients.AkkaHttpClient
import com.bot4s.telegram.models._

object Main extends App {
  // Создаём систему акторов
  implicit val system: ActorSystem = ActorSystem("EchoBotSystem")
  implicit val materializer: ActorMaterializer = ActorMaterializer()

  // Токен вашего бота
  val token = "your-bot-token"

  // Создаём и запускаем бота
  val bot = new EchoBot(token)
  bot.run()
}
