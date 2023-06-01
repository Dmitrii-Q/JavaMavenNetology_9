package JavaMavenNetology.JavaMavenNetology_9.goodsManager;

public class Repo {

    private Product[] goods = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[goods.length + 1];
        for (int i = 0; i < goods.length; i++) {
            tmp[i] = goods[i];
        }
        tmp[tmp.length - 1] = product;
        goods = tmp;
    }

    public Product[] findAll() {

        return goods;
    }

    public void removeByID(int removeID) {
        Product[] tmp = new Product[goods.length - 1];
        int index = 0;
        for (Product product : goods) {
            if (product.getID() != removeID) {
                tmp[index] = product;
                index++;
            }
        }
        goods = tmp;
    }
}
