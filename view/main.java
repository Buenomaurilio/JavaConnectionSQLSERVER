package view;

import dao.ProdutoDao;
import model.Produto;


public class main {

    public static void main(String[] args) {
        ProdutoDao dao = new ProdutoDao();

        for (Produto p : dao.listar()) {
            System.out.println(p.toString());
        }
    }
}
