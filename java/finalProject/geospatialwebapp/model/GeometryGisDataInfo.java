/**
 * 
 */
package finalProject.geospatialwebapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.vividsolutions.jts.geom.Geometry;

/**
 * @author A.Riaydh
 *
 */
@Entity
public class GeometryGisDataInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="seq_geom", strategy="GeometryGisInfoIdGenerator")
	@GeneratedValue(generator="seq_geom")
	long ggdId;
	Long adRefId, referenceNr;
	String adType;
	String adCity;
	String adRoad,adRoadType;
	String adHouseNumber;
	String adPostCode;
	String adCountry;
	
	private String geoType, wktToGeometry;
	// @Type(type="org.hibernate.spatial.GeometryType") required for hibernate <=4 version
    Geometry geom;
    
    public GeometryGisDataInfo() {
		super();
	}
    
	public long getGgdId() {
		return ggdId;
	}

	public void setGgdId(long ggdId) {
		this.ggdId = ggdId;
	}

	public Long getReferenceNr() {
		return referenceNr;
	}

	public void setReferenceNr(Long referenceNr) {
		this.referenceNr = referenceNr;
	}

	

	public Long getAdRefId() {
		return adRefId;
	}

	public void setAdRefId(Long adRefId) {
		this.adRefId = adRefId;
	}

	public String getAdType() {
		return adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	public String getAdCity() {
		return adCity;
	}

	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}

	public String getAdRoad() {
		return adRoad;
	}

	public void setAdRoad(String adRoad) {
		this.adRoad = adRoad;
	}

	public String getAdRoadType() {
		return adRoadType;
	}

	public void setAdRoadType(String adRoadType) {
		this.adRoadType = adRoadType;
	}

	public String getAdHouseNumber() {
		return adHouseNumber;
	}

	public void setAdHouseNumber(String adHouseNumber) {
		this.adHouseNumber = adHouseNumber;
	}

	public String getAdPostCode() {
		return adPostCode;
	}

	public void setAdPostCode(String adPostCode) {
		this.adPostCode = adPostCode;
	}

	public String getAdCountry() {
		return adCountry;
	}

	public void setAdCountry(String adCountry) {
		this.adCountry = adCountry;
	}

	public Geometry getGeom() {
		return geom;
	}

	public void setGeom(Geometry geom) {
		this.geom = geom;
	}

	public String getWktToGeometry() {
		return wktToGeometry;
	}

	public void setWktToGeometry(String wktToGeometry) {
		this.wktToGeometry = wktToGeometry;
	}

	public String getGeoType() {
		return geoType;
	}

	public void setGeoType(String geoType) {
		this.geoType = geoType;
	}

	@Override
	public String toString() {
		return "GeometryGisDataInfo [ggdId=" + ggdId + ", adRefId=" + adRefId + ", referenceNr=" + referenceNr
				+ ", adType=" + adType + ", adCity=" + adCity + ", adRoad=" + adRoad + ", adRoadType=" + adRoadType
				+ ", adHouseNumber=" + adHouseNumber + ", adPostCode=" + adPostCode + ", adCountry=" + adCountry
				+ ", geoType=" + geoType + ", wktToGeometry=" + wktToGeometry + ", geom=" + geom + "]";
	}

	

}
