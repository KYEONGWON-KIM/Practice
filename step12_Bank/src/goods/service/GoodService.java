package goods.service;

import org.apache.log4j.Logger;

import goods.controller.GoodsController;

public class GoodService {
	private static GoodService instance = new GoodService();
	protected static Logger logger = Logger.getLogger(GoodsController.class.getName());

	private GoodService() {
	}

	public static GoodService getInstance() {
		return instance;
	}
	public Logger FatalLog() {
		logger.fatal("log4j:logger.fatal()");
		return logger;
	}

	public Logger DebugLog() {
		logger.debug("log4j:logger.debug()");
		return logger;
	}

	public Logger InfoLog() {
		logger.info("log4j:logger.info()");
		return logger;
	}

	public Logger WarnLog() {
		logger.warn("log4j:logger.warn()");
		return logger;
	}

	public Logger ErrLog() {
		logger.error("log4j:logger.error()");
		return logger;
	}

}
