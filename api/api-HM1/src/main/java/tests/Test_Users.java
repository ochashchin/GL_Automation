package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import api.UsersApiClient;

import javax.ws.rs.core.Form;

public class Test_Users {

    @Test(groups= {"Smoke"})
    public void test_is_user_list() {
        Assert.assertTrue(UsersApiClient.get_list_users());
    }

    @Test(groups= {"Smoke"})
    public void test_is_one_user() {
        Assert.assertTrue(UsersApiClient.get_one_user(2));
    }

    @Test(groups= {"Smoke"})
    public void test_is_one_user_not_found() {
        Assert.assertTrue(UsersApiClient.get_one_user(23));
    }

    @Test(groups= {"Smoke"})
    public void test_is_user_created() throws Exception {
        Assert.assertTrue(UsersApiClient.post_create_user(new Form()
                .param("name", "morpheus")
                .param("job", "leader")));
    }

    @Test(groups= {"Regression"})
    public void test_is_user_updated() {
        Assert.assertTrue(UsersApiClient.put_update_user(new Form()
                .param("name", "morpheus")
                .param("job", "zion resident"), 2));
    }

    @Test(groups= {"Regression"})
    public void test_is_user_deleted() {
        Assert.assertTrue(UsersApiClient.delete_user(2));
    }

    @Test(groups= {"Regression"})
    public void test_is_register_user() throws Exception {
        Assert.assertFalse(UsersApiClient.post_register_user(new Form()
                .param("email", "eve.holt@reqres.in")
                .param("password", "pistol")));
    }

    @Test(groups= {"Regression"})
    public void test_is_register_user_unsuccessful() throws Exception {
        Assert.assertFalse(UsersApiClient.post_register_user_unsuccessful(new Form()
                .param("email", "eve.holt@reqres.in")));
    }
}