import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.bot4s.telegram.api._
import com.bot4s.telegram.clients.AkkaHttpClient
import com.bot4s.telegram.models._

class EchoBot(token: String)(implicit val system: ActorSystem, materializer: ActorMaterializer) 
  extends TelegramBot with AkkaHttpClient {

  override val client = new AkkaHttpClient(token)

  onMessage { implicit msg =>
    request(SendMessage(msg.chat.id, s"Echo: ${msg.text.getOrElse("empty message")}"))
  }
}
