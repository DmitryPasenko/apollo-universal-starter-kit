package app

import com.google.inject.{Inject, Singleton}
import common.shapes.ServerModule

@Singleton
class GlobalModule @Inject()()(counter: CounterModule,
                               contact: ContactModule,
                               upload: UploadModule) extends ServerModule(Seq(counter, contact, upload))