package boeing.hr;

/**
 * 
 * @author Vipul
 *	
 *<p>
 * Header structure of the MIS file 
 *</p>
 */
public class IHEAD {
	
	public static int IHDR_SIZE =  288;	/* len of hdr record (always even bytes) */
	public static int BYTE_SIZE =  8;	/* # of ASCII chars to represent a short */
	public static int BUFSIZE =  80;	/* default buffer size */
	public static int DATELEN =  26;	/* character length of date string */
	
	private byte id[];			/* identification/comment field */
	private byte created[];		/* date created */
	private byte width[];		/* pixel width of image */
	private byte height[];		/* pixel height of image */
	private byte depth[];		/* bits per pixel */
	private byte density[];		/* pixels per inch */
	private byte compress[];		/* compression code */
	private byte complen[];		/* compressed data length */
	private byte align[];		/* scanline multiple: 8|16|32 */
	private byte unitsize[];		/* bit size of image memory units */
	private byte sigbit;				/* 0->sigbit first | 1->sigbit last */
	private byte byte_order;			/* 0->highlow | 1->lowhigh*/
	private byte pix_offset[];	/* pixel column offset */
	private byte whitepix[];		/* intensity of white pixel */
	private byte issigned;			/* 0->unsigned data | 1->signed data */
	private byte rm_cm;				/* 0->row maj | 1->column maj */
	private byte tb_bt;				/* 0->top2bottom | 1->bottom2top */
	private byte lr_rl;				/* 0->left2right | 1->right2left */
	private byte parent[];		/* parent image file */
	private byte par_x[];		/* from x pixel in parent */
	private byte par_y[];		/* from y pixel in parent */
	
	public IHEAD(){
		id = new byte[BUFSIZE];
		created = new byte[DATELEN];
		width = new byte[BYTE_SIZE];
		height = new byte [BYTE_SIZE];
		depth = new byte [BYTE_SIZE];
		density = new byte [BYTE_SIZE];
		compress= new byte [BYTE_SIZE];
		complen= new byte [BYTE_SIZE];
		align= new byte [BYTE_SIZE];
		unitsize= new byte [BYTE_SIZE];
		pix_offset= new byte [BYTE_SIZE];
		whitepix= new byte [BYTE_SIZE];
		parent= new byte [BUFSIZE];
		par_x= new byte [BYTE_SIZE];
		par_y= new byte [BYTE_SIZE];
		
	}

	public byte[] getId() {
		return id;
	}

	public void setId(byte[] id) {
		this.id = id;
	}

	public byte[] getCreated() {
		return created;
	}

	public void setCreated(byte[] created) {
		this.created = created;
	}

	public byte[] getWidth() {
		return width;
	}

	public void setWidth(byte[] width) {
		this.width = width;
	}

	public byte[] getHeight() {
		return height;
	}

	public void setHeight(byte[] height) {
		this.height = height;
	}

	public byte[] getDepth() {
		return depth;
	}

	public void setDepth(byte[] depth) {
		this.depth = depth;
	}

	public byte[] getDensity() {
		return density;
	}

	public void setDensity(byte[] density) {
		this.density = density;
	}

	public byte[] getCompress() {
		return compress;
	}

	public void setCompress(byte[] compress) {
		this.compress = compress;
	}

	public byte[] getComplen() {
		return complen;
	}

	public void setComplen(byte[] complen) {
		this.complen = complen;
	}

	public byte[] getAlign() {
		return align;
	}

	public void setAlign(byte[] align) {
		this.align = align;
	}

	public byte[] getUnitsize() {
		return unitsize;
	}

	public void setUnitsize(byte[] unitsize) {
		this.unitsize = unitsize;
	}

	public byte getSigbit() {
		return sigbit;
	}

	public void setSigbit(byte sigbit) {
		this.sigbit = sigbit;
	}

	public byte getByte_order() {
		return byte_order;
	}

	public void setByte_order(byte byte_order) {
		this.byte_order = byte_order;
	}

	public byte[] getPix_offset() {
		return pix_offset;
	}

	public void setPix_offset(byte[] pix_offset) {
		this.pix_offset = pix_offset;
	}

	public byte[] getWhitepix() {
		return whitepix;
	}

	public void setWhitepix(byte[] whitepix) {
		this.whitepix = whitepix;
	}

	public byte getIssigned() {
		return issigned;
	}

	public void setIssigned(byte issigned) {
		this.issigned = issigned;
	}

	public byte getRm_cm() {
		return rm_cm;
	}

	public void setRm_cm(byte rm_cm) {
		this.rm_cm = rm_cm;
	}

	public byte getTb_bt() {
		return tb_bt;
	}

	public void setTb_bt(byte tb_bt) {
		this.tb_bt = tb_bt;
	}

	public byte getLr_rl() {
		return lr_rl;
	}

	public void setLr_rl(byte lr_rl) {
		this.lr_rl = lr_rl;
	}

	public byte[] getParent() {
		return parent;
	}

	public void setParent(byte[] parent) {
		this.parent = parent;
	}

	public byte[] getPar_x() {
		return par_x;
	}

	public void setPar_x(byte[] par_x) {
		this.par_x = par_x;
	}

	public byte[] getPar_y() {
		return par_y;
	}

	public void setPar_y(byte[] par_y) {
		this.par_y = par_y;
	}
	

}
