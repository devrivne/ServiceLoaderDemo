package org.luis

import java.util.ServiceLoader
import scala.collection.JavaConverters._
/**
 * Created by luislazaro on 18/9/15.
 * lalazaro@keedio.com
 * Keedio
 */

object ServiceLoaderDemo {
    def main(args: Array[String]) {
        val serviceLoader: ServiceLoader[Service] = ServiceLoader.load(classOf[Service])
        val aToScala: Iterable[Service] = serviceLoader.asScala
        val serviceLoaderList = aToScala.toList
        serviceLoaderList foreach(_.doSomething)
    }
}
