package net.mrliuli;

import redis.clients.jedis.*;

import java.util.Iterator;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Jedis jedis = new Jedis("localhost");

        System.out.println(jedis.auth("leon"));

        System.out.println(jedis.ping());

        System.out.println(jedis.get("myKey"));
        System.out.println(jedis.get("book-name"));

        System.out.println(jedis.set("runoobkey", "www.runoob.com"));
        System.out.println(jedis.get("runoobkey"));

        System.out.println( "Hello World!" );

        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
}
