package boeing.hr;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 
 * @author Vipul
 * 
 * <p>
 * Reads the MIS files and returns the header information
 * </p>
 *
 */
public class ReadMIS {

	
	public static IHEAD readMISHeader() throws IOException{
		
		
		int size = 296;
        byte[] buffer = new byte[size];

        FileInputStream inputStream = new FileInputStream("src/boeing/hr/4A.MIS");        
        inputStream.read(buffer);        
        inputStream.close();  
        		
		int start = 8;
		IHEAD head = new IHEAD();
		
		head.setId(Arrays.copyOfRange(buffer, start, start + IHEAD.BUFSIZE - 1));
		start += IHEAD.BUFSIZE;
		head.setCreated(Arrays.copyOfRange(buffer, start, start + IHEAD.DATELEN - 1));
		start += IHEAD.DATELEN;
		head.setWidth(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;		
		head.setHeight(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setDepth(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setDensity(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setCompress(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setComplen(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setAlign(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setUnitsize(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setSigbit(buffer[start]);
		start += 1;
		head.setByte_order(buffer[start]);
		start += 1;
		head.setPix_offset(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setWhitepix(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setIssigned(buffer[start]);
		start += 1;
		head.setRm_cm(buffer[start]);
		start += 1;
		head.setTb_bt(buffer[start]);
		start += 1;
		head.setLr_rl(buffer[start]);
		start += 1;
		head.setParent(Arrays.copyOfRange(buffer, start, start + IHEAD.BUFSIZE - 1));
		start += IHEAD.BUFSIZE;
		head.setPar_x(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		head.setPar_y(Arrays.copyOfRange(buffer, start, start + IHEAD.BYTE_SIZE - 1));
		start += IHEAD.BYTE_SIZE;
		
		
		return head;
	}
	
	/**
	 * Prints the header information of the MIS file
	 * @param head
	 */
	private static void printHeader(IHEAD head){
		
		System.out.println("ID: " + new String(head.getId()).trim());
		System.out.println("Date Created: " + new String(head.getCreated()).trim());
		System.out.println("Width: "+ new String(head.getWidth()).trim());
		System.out.println("Height:" + new String(head.getHeight()).trim());
		System.out.println("Depth: "+ new String(head.getDepth()).trim());
		System.out.println("Density: "+ new String(head.getDensity()).trim());
		System.out.println("Compression code: " +new String(head.getCompress()).trim());
		System.out.println("Compressed data length: " +new String(head.getComplen()).trim());
		System.out.println("Align: " +new String(head.getAlign()).trim());
		System.out.println("Unit Size: " +new String(head.getUnitsize()).trim());
		System.out.println("Sig Bit: " + (char)head.getSigbit());
		System.out.println("Byte Order: " + (char)head.getByte_order());
		System.out.println("Pixel col offset: " +new String(head.getPix_offset()).trim());
		System.out.println("White pix intensity: " +new String(head.getWhitepix()).trim());
		System.out.println("Is signed: " + (char)head.getIssigned());
		System.out.println("Row/Col major: " + (char)head.getRm_cm());
		System.out.println("Top2Bottom/Bottom2Top: " + (char)head.getTb_bt());
		System.out.println("Left2Right/Right2Left: " + (char)head.getLr_rl());
		System.out.println("Parent file: " +new String(head.getParent()).trim());
		System.out.println("From x pix in parent: " +new String(head.getPar_x()).trim());
		System.out.println("From y pix in parent: " +new String(head.getPar_y()).trim());
	}
	public static void main(String args[]) throws IOException{
		
		printHeader(readMISHeader());
	}
}
