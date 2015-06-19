package testMQBeanFieldsOffset;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.BitSet;

@SuppressWarnings("unused")
public class Corp {
	private static final long serialVersionUID = -5182532647273106745L;


	private Long uid = 0L;
//	private enum Action {
//	    STOP, RIGHT, LEFT, UP, DOWN
//	}
//	private enum ActionB {
//	    STOP, RIGHT, LEFT, UP, DOWN
//	}
//	private Action enumA=Action.LEFT;
//	private ActionB enumB=ActionB.DOWN;
	private boolean tntc=false;
	private  String ccdd=null;
	private String aaaaaaaaaa="ZZZZNN \n c \tN\"NNpppp";
	private static String ccddee="TTTTTTTTTTTTT";
	private String abcdfffffffff="abcdefgh";
	private String ccddeeff="zzzzzzzzzzzzz";
	private String name = "abc";
	private String EName = "TeEName";
	//private static final String description="aaa";
	private String zipCode;
	private String fax="\naddd\t";
	private static String EMail="aabcc@sohu.com";
	private static final String EMail2="aabcc@sohu.com";
	private Integer isEmailOpen;
	private Integer EMailChecked;
	private Timestamp regDateOnGov;
	private  String backroll;
	private  String aabccc="aaaaaa";
	private String address;
	private  double dou22=12L;
	private String webStoreUrl;
	private Integer corpGrade;
	private String tel;
	private double dou00=12L;
	private  Integer cityId = 100;
	private  Integer zaa = 200;
	private  Integer zbb = -100;
	//private static int zaa1 = 200;
//	private static int zbb2 = -100;
	private Integer isNew;
	private Integer credit;
	private Integer activeDegrees;
	private Integer hits;
	private Integer isHitsRecord;
	private Timestamp regTimeOnZfa=new Timestamp(10000L);
	private Integer corpType;
	//private static double dou11=12L;
	private Integer corpMajorcategoryId;
	private Integer businessRoleId;
	private String keyword = "password";
	private Integer developState;
	private String isAlert;
	private transient Integer advMemState;
	private Integer advStockState;
	private Integer allianceState;
	private Timestamp lastUpdateTime;
	private Integer corpMajorcategoryId1;
	private String keyword1;
	//private static Long certificatePic=1000L;
	//private static Long acertificatePic=-1L;
	private Integer isUpdateCharter;
	private Integer currcount;
	private Integer curronsale;
	private Integer curronhot;
	private Integer currniccount;
	private Integer currniconsale;
	private Integer currniconhot;
	private String buyProducts;
	private Integer isOpenShop;
	private Integer state;
	private String mainProduct;
	private transient String advBrandIds;
	private String feature;
	private Integer category;
	private Integer contactFlag;
	private String kyk;
	private int cky = 2;
	private String fastPassage;
	
	private target2 a22222 = new target2();
	private List<target2> List_target3 = new ArrayList<target2>();
	private List<List<target2>> List_target32 = null;
	private List<target2> List_target2 = new ArrayList<target2>();
	private List<Integer> List_targetint = new ArrayList<Integer>();
	private List<String> List_targetS = new ArrayList<String>();
	public transient  Map<String, Object> map222 = new HashMap<String, Object>();
	private transient  Map<String, Object> map = new HashMap<String, Object>();
	private Map<String, Object> map2 = new HashMap<String, Object>();
	private double dou=12L;
	private double[] dou2={12,20};
	private Object kkk = null;
	private boolean[] qq = { true, false, true };
	private target2[] qqq = { new target2(), new target2(), new target2() };
	private long[] qqqq = { 1000, 200, 240 };
	private String[] q = { "aaaa", "ttt", "bbbb" };
	private int[] r = { 300, 100, 200 };
	private BitSet BitSet = new BitSet();
	private Map<Integer, Map<Integer, Integer>> aaaaa = new HashMap<Integer, Map<Integer, Integer>>();
	private Map<java.lang.Character, Map<Integer, Integer>> aaaaaa = new HashMap<java.lang.Character, Map<Integer, Integer>>();

	public Corp() {
		//System.out.println("corp:target2:"+target2.class.hashCode());
		target2 a22 = new target2(100, "ccc");
		List_target2.add(a22);
		target2 a222 = new target2(200, "ddd");
		List_target2.add(a222);
		target2 a2222 = new target2(90, "eee");
		List_target2.add(a2222);
		List_targetS.add("BBBB");
		List_targetS.add("AAA");
		List_targetS.add("ZZZZZ");
		List_targetint.add(300);
		List_targetint.add(100);
		List_targetint.add(200);
		BitSet.set(3);
		BitSet.set(5);
		BitSet.set(7);
		Map<Integer, Integer> aa = new HashMap<Integer, Integer>();
		aa.put(100, 1000);
		aa.put(200, 2000);
		aaaaa.put(10, aa);
		aaaaaa.put('a', aa);
		aa.clear();
		aa.put(100, 1500);
		aa.put(200, 3000);
		aaaaa.put(15, aa);
		aaaaaa.put('b', aa);
	}

	public Object getKkk() {
		return kkk;
	}

	public void setKkk(Object kkk) {
		this.kkk = kkk;
	}

	public final Long getUid() {
		return uid;
	}

	public final void setUid(Long uid) {
		this.uid = uid;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final boolean isTntc() {
		return tntc;
	}

	public final void setTntc(boolean tntc) {
		this.tntc = tntc;
	}

	public final String getCcdd() {
		return ccdd;
	}

	public final void setCcdd(String ccdd) {
		this.ccdd = ccdd;
	}

	public final String getCcddee() {
		return ccddee;
	}


	public final String getCcddeeff() {
		return ccddeeff;
	}

	public final void setCcddeeff(String ccddeeff) {
		this.ccddeeff = ccddeeff;
	}

	public final String getEName() {
		return EName;
	}

	public final void setEName(String eName) {
		EName = eName;
	}

	public final String getZipCode() {
		return zipCode;
	}

	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public final String getFax() {
		return fax;
	}

	public final void setFax(String fax) {
		this.fax = fax;
	}

	public final String getEMail() {
		return EMail;
	}

	public final void setEMail(String eMail) {
		EMail = eMail;
	}

	public final Integer getIsEmailOpen() {
		return isEmailOpen;
	}

	public final void setIsEmailOpen(Integer isEmailOpen) {
		this.isEmailOpen = isEmailOpen;
	}

	public final Integer getEMailChecked() {
		return EMailChecked;
	}

	public final void setEMailChecked(Integer eMailChecked) {
		EMailChecked = eMailChecked;
	}

	public final Timestamp getRegDateOnGov() {
		return regDateOnGov;
	}

	public final void setRegDateOnGov(Timestamp regDateOnGov) {
		this.regDateOnGov = regDateOnGov;
	}

	public final String getBackroll() {
		return backroll;
	}

	public final void setBackroll(String backroll) {
		this.backroll = backroll;
	}

	public final String getAabccc() {
		return aabccc;
	}

	public final void setAabccc(String aabccc) {
		this.aabccc = aabccc;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public final double getDou22() {
		return dou22;
	}

	public final void setDou22(double dou22) {
		this.dou22 = dou22;
	}

	public final String getWebStoreUrl() {
		return webStoreUrl;
	}

	public final void setWebStoreUrl(String webStoreUrl) {
		this.webStoreUrl = webStoreUrl;
	}

	public final Integer getCorpGrade() {
		return corpGrade;
	}

	public final void setCorpGrade(Integer corpGrade) {
		this.corpGrade = corpGrade;
	}

	public final String getTel() {
		return tel;
	}

	public final void setTel(String tel) {
		this.tel = tel;
	}

	public final double getDou00() {
		return dou00;
	}

	public final void setDou00(double dou00) {
		this.dou00 = dou00;
	}

	public final Integer getCityId() {
		return cityId;
	}

	public final void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public final Integer getZaa() {
		return zaa;
	}

	public final void setZaa(Integer zaa) {
		this.zaa = zaa;
	}

	public final Integer getZbb() {
		return zbb;
	}

	public final void setZbb(Integer zbb) {
		this.zbb = zbb;
	}

	public final Integer getIsNew() {
		return isNew;
	}

	public final void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public final Integer getCredit() {
		return credit;
	}

	public final void setCredit(Integer credit) {
		this.credit = credit;
	}

	public final Integer getActiveDegrees() {
		return activeDegrees;
	}

	public final void setActiveDegrees(Integer activeDegrees) {
		this.activeDegrees = activeDegrees;
	}

	public final Integer getHits() {
		return hits;
	}

	public final void setHits(Integer hits) {
		this.hits = hits;
	}

	public final Integer getIsHitsRecord() {
		return isHitsRecord;
	}

	public final void setIsHitsRecord(Integer isHitsRecord) {
		this.isHitsRecord = isHitsRecord;
	}

	public final Timestamp getRegTimeOnZfa() {
		return regTimeOnZfa;
	}

	public final void setRegTimeOnZfa(Timestamp regTimeOnZfa) {
		this.regTimeOnZfa = regTimeOnZfa;
	}

	public final Integer getCorpType() {
		return corpType;
	}

	public final void setCorpType(Integer corpType) {
		this.corpType = corpType;
	}

	public final Integer getCorpMajorcategoryId() {
		return corpMajorcategoryId;
	}

	public final void setCorpMajorcategoryId(Integer corpMajorcategoryId) {
		this.corpMajorcategoryId = corpMajorcategoryId;
	}

	public final Integer getBusinessRoleId() {
		return businessRoleId;
	}

	public final void setBusinessRoleId(Integer businessRoleId) {
		this.businessRoleId = businessRoleId;
	}

	public final String getKeyword() {
		return keyword;
	}

	public final void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public final Integer getDevelopState() {
		return developState;
	}

	public final void setDevelopState(Integer developState) {
		this.developState = developState;
	}

	public final String getIsAlert() {
		return isAlert;
	}

	public final void setIsAlert(String isAlert) {
		this.isAlert = isAlert;
	}

	public final Integer getAdvMemState() {
		return advMemState;
	}

	public final void setAdvMemState(Integer advMemState) {
		this.advMemState = advMemState;
	}

	public final Integer getAdvStockState() {
		return advStockState;
	}

	public final void setAdvStockState(Integer advStockState) {
		this.advStockState = advStockState;
	}

	public final Integer getAllianceState() {
		return allianceState;
	}

	public final void setAllianceState(Integer allianceState) {
		this.allianceState = allianceState;
	}

	public final Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}

	public final void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public final Integer getCorpMajorcategoryId1() {
		return corpMajorcategoryId1;
	}

	public final void setCorpMajorcategoryId1(Integer corpMajorcategoryId1) {
		this.corpMajorcategoryId1 = corpMajorcategoryId1;
	}

	public final String getKeyword1() {
		return keyword1;
	}

	public final void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}

	public final Integer getIsUpdateCharter() {
		return isUpdateCharter;
	}

	public final void setIsUpdateCharter(Integer isUpdateCharter) {
		this.isUpdateCharter = isUpdateCharter;
	}

	public final Integer getCurrcount() {
		return currcount;
	}

	public final void setCurrcount(Integer currcount) {
		this.currcount = currcount;
	}

	public final Integer getCurronsale() {
		return curronsale;
	}

	public final void setCurronsale(Integer curronsale) {
		this.curronsale = curronsale;
	}

	public final Integer getCurronhot() {
		return curronhot;
	}

	public final void setCurronhot(Integer curronhot) {
		this.curronhot = curronhot;
	}

	public final Integer getCurrniccount() {
		return currniccount;
	}

	public final void setCurrniccount(Integer currniccount) {
		this.currniccount = currniccount;
	}

	public final Integer getCurrniconsale() {
		return currniconsale;
	}

	public final void setCurrniconsale(Integer currniconsale) {
		this.currniconsale = currniconsale;
	}

	public final Integer getCurrniconhot() {
		return currniconhot;
	}

	public final void setCurrniconhot(Integer currniconhot) {
		this.currniconhot = currniconhot;
	}

	public final String getBuyProducts() {
		return buyProducts;
	}

	public final void setBuyProducts(String buyProducts) {
		this.buyProducts = buyProducts;
	}

	public final Integer getIsOpenShop() {
		return isOpenShop;
	}

	public final void setIsOpenShop(Integer isOpenShop) {
		this.isOpenShop = isOpenShop;
	}

	public final Integer getState() {
		return state;
	}

	public final void setState(Integer state) {
		this.state = state;
	}

	public final String getMainProduct() {
		return mainProduct;
	}

	public final void setMainProduct(String mainProduct) {
		this.mainProduct = mainProduct;
	}

	public final String getAdvBrandIds() {
		return advBrandIds;
	}

	public final void setAdvBrandIds(String advBrandIds) {
		this.advBrandIds = advBrandIds;
	}

	public final String getFeature() {
		return feature;
	}

	public final void setFeature(String feature) {
		this.feature = feature;
	}

	public final Integer getCategory() {
		return category;
	}

	public final void setCategory(Integer category) {
		this.category = category;
	}

	public final Integer getContactFlag() {
		return contactFlag;
	}

	public final void setContactFlag(Integer contactFlag) {
		this.contactFlag = contactFlag;
	}

	public final String getKyk() {
		return kyk;
	}

	public final void setKyk(String kyk) {
		this.kyk = kyk;
	}

	public final int getCky() {
		return cky;
	}

	public final void setCky(int cky) {
		this.cky = cky;
	}

	public final String getFastPassage() {
		return fastPassage;
	}

	public final void setFastPassage(String fastPassage) {
		this.fastPassage = fastPassage;
	}

	public final List<target2> getList_target3() {
		return List_target3;
	}

	public final void setList_target3(List<target2> list_target3) {
		List_target3 = list_target3;
	}

	public final double getDou() {
		return dou;
	}

	public final void setDou(double dou) {
		this.dou = dou;
	}

	public final double[] getDou2() {
		return dou2;
	}

	public final void setDou2(double[] dou2) {
		this.dou2 = dou2;
	}

	public final boolean[] getQq() {
		return qq;
	}

	public final void setQq(boolean[] qq) {
		this.qq = qq;
	}

	public final target2[] getQqq() {
		return qqq;
	}

	public final void setQqq(target2[] qqq) {
		this.qqq = qqq;
	}

	public final long[] getQqqq() {
		return qqqq;
	}

	public final void setQqqq(long[] qqqq) {
		this.qqqq = qqqq;
	}

	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

	public BitSet getBitSet() {
		return BitSet;
	}

	public void setBitSet(BitSet bitSet) {
		BitSet = bitSet;
	}

	public String[] getQ() {
		return q;
	}

	public void setQ(String[] q) {
		this.q = q;
	}

	public int[] getR() {
		return r;
	}

	public void setR(int[] r) {
		this.r = r;
	}

	public List<Integer> getList_targetint() {
		return List_targetint;
	}

	public void setList_targetint(List<Integer> list_targetint) {
		List_targetint = list_targetint;
	}

	public List<String> getList_targetS() {
		return List_targetS;
	}

	public void setList_targetS(List<String> list_targetS) {
		List_targetS = list_targetS;
	}

	public List<target2> getList_target2() {
		return List_target2;
	}

	public void setList_target2(List<target2> list_target2) {
		List_target2 = list_target2;
	}

	public target2 getA22222() {
		return a22222;
	}

	public void setA22222(target2 a22222) {
		this.a22222 = a22222;
	}

	public Map<Integer, Map<Integer, Integer>> getAaaaa() {
		return aaaaa;
	}

	public void setAaaaa(Map<Integer, Map<Integer, Integer>> aaaaa) {
		this.aaaaa = aaaaa;
	}

	public Map<java.lang.Character, Map<Integer, Integer>> getAaaaaa() {
		return aaaaaa;
	}

	public void setAaaaaa(Map<java.lang.Character, Map<Integer, Integer>> aaaaaa) {
		this.aaaaaa = aaaaaa;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Map<String, Object> getMap2() {
		return map2;
	}

	public void setMap2(Map<String, Object> map2) {
		this.map2 = map2;
	}

}
