package aiss.contoller;

import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.SearchVideos;

public class SearchController extends HttpServlet{
	private static final Logger log = Logger.getLogger(SearchController.class.getName());
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		log.log(Level.INFO, "Procesando SearchController.");

		String query = request.getParameter("query");
		SearchVideos results = new YoutubeResource().getVideo(query);

		if (results != null) {
			log.log(Level.INFO, "Buscando.");
			request.setAttribute("informacion", results);
			rd = request.getRequestDispatcher("/lista.jsp");
			log.log(Level.FINE, "Búsqueda realiazada y procesada correctamente.");
		} else {
			log.log(Level.WARNING, "Error al realizar la búsqueda: " + results);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}

}
