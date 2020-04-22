package com.edwinisaacclass1604.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edwinisaacclass1604.DAO.ProductoDao;
import com.edwinisaacclass1604.model.Producto;
import com.google.gson.Gson;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Producto pr = new Producto();
		ProductoDao prd = new ProductoDao();
		
		
		String  id = null;
		String nombrepr = null;
		String preciopr = null;
		String cantidadpr = null;
		String totalpr = null;
		
		
		try {
			
			id = request.getParameter("Id");
			nombrepr = request.getParameter("Nproducto");
			preciopr = request.getParameter("Pproducto");
			cantidadpr = request.getParameter("Cproducto");
			totalpr = request.getParameter("Tproducto");
			
			pr.setId(Integer.parseInt(id));
		    pr.setNombreProducto(nombrepr);
		    pr.setPrecioProducto(Double.parseDouble(preciopr));
		    pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		    pr.setTotalProducto(Double.parseDouble(totalpr));
			
			
			
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
	    String acction = request.getParameter("btn");
		
		if (acction.equals("GUARDAR")) {
			
	    pr.setId(Integer.parseInt(id));
	    pr.setNombreProducto(nombrepr);
	    pr.setPrecioProducto(Double.parseDouble(preciopr));
	    pr.setCantidadProducto(Integer.parseInt(cantidadpr));
	    pr.setTotalProducto(Double.parseDouble(totalpr));
	    
	    prd.agregarDatos(pr);
		}
		else if (acction.equals("ACTUALIZAR")) {
			pr.setId(Integer.parseInt(id));
		    pr.setNombreProducto(nombrepr);
		    pr.setPrecioProducto(Double.parseDouble(preciopr));
		    pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		    pr.setTotalProducto(Double.parseDouble(totalpr));
		    
		    prd.actualizarDatos(pr);
	   
		}
		else if (acction.equals("ELIMINAR")) {
			pr.setId(Integer.parseInt(id));
		    prd.eliminarDatos(pr);
	   
		}
	    response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	    ProductoDao prdao = new ProductoDao();
	    
		Gson json = new Gson();
		
		try {
			
			response.getWriter().append(json.toJson(prdao.producotoLista()));
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
			
		}
		
		
		
	}

}
