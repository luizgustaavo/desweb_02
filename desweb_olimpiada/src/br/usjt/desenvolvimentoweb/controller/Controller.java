package br.usjt.desenvolvimentoweb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.desenvolvimentoweb.model.entity.Ano;
import br.usjt.desenvolvimentoweb.model.entity.Modalidade;
import br.usjt.desenvolvimentoweb.model.entity.Pais;
import br.usjt.desenvolvimentoweb.model.service.AnoService;
import br.usjt.desenvolvimentoweb.model.service.ModalidadeService;
import br.usjt.desenvolvimentoweb.model.service.PaisService;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/DesWeb_Olimpiada")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int IdAno = Integer.parseInt(request.getParameter("id"));
		String TipoAno = request.getParameter("tipo");
		
		
		int IdModalidade = Integer.parseInt(request.getParameter("id"));
		String NomeModalidade = request.getParameter("nome");
		String TipoModalidade = request.getParameter("tipo");
		
		
		int IdPais = Integer.parseInt(request.getParameter("id"));
		String NomePais = request.getParameter("nome");
		double AreaPais = Double.parseDouble(request.getParameter("id"));
		long PopulacaoPais = Long.parseLong(request.getParameter("id"));
		
		

		// instanciar o javabean
		Ano ano = new Ano();
		ano.setId(IdAno);
		ano.setTipo(TipoAno);

		// instanciar o javabean
		Modalidade modalidade = new Modalidade();
		modalidade.setId(IdModalidade);
		modalidade.setNome(NomeModalidade);
		modalidade.setTipo(TipoModalidade);


		// instanciar o javabean
		Pais pais = new Pais();
		pais.setId(IdPais);
		pais.setNome(NomePais);
		pais.setArea(AreaPais);
		pais.setPopulacao(PopulacaoPais);
		
		
		
		

		// instanciar o service
		AnoService as = new AnoService();
		as.criar(ano);
		ano = as.carregar(ano.getId());

		// instanciar o service
		ModalidadeService ms = new ModalidadeService();
		ms.criar(modalidade);
		modalidade = ms.carregar(modalidade.getId());

		

		// instanciar o service
		PaisService ps = new PaisService();
		ps.criar(pais);
		pais = ps.carregar(pais.getId());

		
		
		
		// enviar para o jsp
		request.setAttribute("ano", ano);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("pais", pais);
		
		
		

		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);

	}

}
