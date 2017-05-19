import java.io.IOException;

import org.apache.log4j.Logger;

public class log4jExample{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class.getName());
   
   public static void main(String[] args)throws IOException{
	   log.info("<15>1 DockerMc001.hp.com OrderSrv - ZL-HP-OW - BOM OrderID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com OrderSrv - ZL-HP-OW - BOM OrderID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com OrderSrv - ZL-HP-OW - BOM OrderID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com PaymentSrv - ZL-HP-OW - BOM PaymentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com PaymentSrv - ZL-HP-OW - BOM PaymentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com PaymentSrv - ZL-HP-OW - BOM PaymentID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com SHipmentSrv - ZL-HP-OW - BOM ShipmentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com SHipmentSrv - ZL-HP-OW - BOM ShipmentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com SHipmentSrv - ZL-HP-OW - BOM ShipmentID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com OrderSrv - ZL-Desma-OW - BOM OrderID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com OrderSrv - ZL-Desma-OW - BOM OrderID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com OrderSrv - ZL-Desma-OW - BOM OrderID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com PaymentSrv - ZL-Desma-OW - BOM PaymentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com PaymentSrv - ZL-Desma-OW - BOM PaymentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com PaymentSrv - ZL-Desma-OW - BOM PaymentID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com SHipmentSrv - ZL-Desma-OW - BOM ShipmentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com SHipmentSrv - ZL-Desma-OW - BOM ShipmentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com SHipmentSrv - ZL-Desma-OW - BOM ShipmentID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com OrderSrv - ZL-Rsscan-OW - BOM OrderID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com OrderSrv - ZL-Rsscan-OW - BOM OrderID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com OrderSrv - ZL-Rsscan-OW - BOM OrderID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com PaymentSrv - ZL-Rsscan-OW - BOM PaymentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com PaymentSrv - ZL-Rsscan-OW - BOM PaymentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com PaymentSrv - ZL-Rsscan-OW - BOM PaymentID state updated to Production");
		log.info("<15>1 DockerMc001.hp.com SHipmentSrv - ZL-Rsscan-OW - BOM ShipmentID state updated to Production");
		log.debug("<13>1 DockerMc001.hp.com SHipmentSrv - ZL-Rsscan-OW - BOM ShipmentID state updated to Production");
		log.warn("<10>1 DockerMc001.hp.com SHipmentSrv - ZL-Rsscan-OW - BOM ShipmentID state updated to Production");
   }
}