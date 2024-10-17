package lan.dev.data.impl;

import lan.dev.data.dao.CategoryDao;
import lan.dev.data.dao.DatabaseDao;
import lan.dev.data.dao.OrderDao;
import lan.dev.data.dao.OrderItemDao;
import lan.dev.data.dao.ProductDao;
import lan.dev.data.dao.UserDao;

public class Database extends DatabaseDao {
    @Override
    public ProductDao getProductDao() {
        // TODO Auto-generated method stub
        return new ProductImpl();
    }
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
}
