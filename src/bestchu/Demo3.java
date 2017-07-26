package bestchu;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class Demo3 {
	public static void main(String[] args){
		while(true){
			Sigar sigar = new Sigar();
			CpuPerc[] cpuList = null;
			try {
				cpuList = sigar.getCpuPercList();
			} catch (SigarException e) {
				e.printStackTrace();
			}
			if(System.currentTimeMillis()%100 == 0){
				System.out.println(CpuPerc.format(cpuList[0].getCombined()));
			}
		}
	}
}
