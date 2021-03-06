package problems.easy;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

/**
 * Created by stream on 17-3-31.
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num<10)
            return num;
        int tmp_num=num;
        while(tmp_num>=10){
            int num_1=tmp_num;
            int tmp=0;
            while(num_1>0){
                tmp+=num_1%10;
                num_1/=10;
            }
            tmp_num=tmp;
        }
        return tmp_num;
    }
    public static void main(String[] args){
        AddDigits ad=new AddDigits();
        System.out.println(ad.addDigits(10));
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        for(int i=0;i<Integer.MAX_VALUE;i++) {
            double pi = 0;
            double dx = 1e-3;
            for (double x = -100; x <= +100; x += dx) {
                pi += Math.exp(-x * x) * dx;
            }
            System.out.println(osBean.getProcessCpuLoad());//指CPU的负载情况
        }
    }
}
