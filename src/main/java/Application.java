/**
 * @author qijun
 * @date 2020/7/1 17:53
 */
public class Application {
    public static void main(String[] args) throws Exception{
        HttpServer server = new HttpServer(8081);// 8081为启动端口
        server.start();
    }
}
