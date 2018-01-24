package com.example.brownv4.aacpoc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vincent.brown on 6/8/17.
 */

public class Datum {

    @SerializedName("sort_order")
    @Expose
    private Integer sortOrder;
    @SerializedName("wmo")
    @Expose
    private Integer wmo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("history_product")
    @Expose
    private String historyProduct;
    @SerializedName("local_date_time")
    @Expose
    private String localDateTime;
    @SerializedName("local_date_time_full")
    @Expose
    private String localDateTimeFull;
    @SerializedName("aifstime_utc")
    @Expose
    private String aifstimeUtc;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("apparent_t")
    @Expose
    private Double apparentT;
    @SerializedName("cloud")
    @Expose
    private String cloud;
    @SerializedName("cloud_base_m")
    @Expose
    private Integer cloudBaseM;
    @SerializedName("cloud_oktas")
    @Expose
    private Integer cloudOktas;
    @SerializedName("cloud_type")
    @Expose
    private String cloudType;
    @SerializedName("cloud_type_id")
    @Expose
    private Integer cloudTypeId;
    @SerializedName("delta_t")
    @Expose
    private Double deltaT;
    @SerializedName("gust_kmh")
    @Expose
    private Integer gustKmh;
    @SerializedName("gust_kt")
    @Expose
    private Integer gustKt;
    @SerializedName("air_temp")
    @Expose
    private Double airTemp;
    @SerializedName("dewpt")
    @Expose
    private Double dewpt;
    @SerializedName("press")
    @Expose
    private Double press;
    @SerializedName("press_msl")
    @Expose
    private Double pressMsl;
    @SerializedName("press_qnh")
    @Expose
    private Double pressQnh;
    @SerializedName("press_tend")
    @Expose
    private String pressTend;
    @SerializedName("rain_trace")
    @Expose
    private String rainTrace;
    @SerializedName("rel_hum")
    @Expose
    private Integer relHum;
    @SerializedName("sea_state")
    @Expose
    private String seaState;
    @SerializedName("swell_dir_worded")
    @Expose
    private String swellDirWorded;
    @SerializedName("swell_height")
    @Expose
    private Object swellHeight;
    @SerializedName("swell_period")
    @Expose
    private Object swellPeriod;
    @SerializedName("vis_km")
    @Expose
    private String visKm;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("wind_spd_kmh")
    @Expose
    private Integer windSpdKmh;
    @SerializedName("wind_spd_kt")
    @Expose
    private Integer windSpdKt;

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getWmo() {
        return wmo;
    }

    public void setWmo(Integer wmo) {
        this.wmo = wmo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistoryProduct() {
        return historyProduct;
    }

    public void setHistoryProduct(String historyProduct) {
        this.historyProduct = historyProduct;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getLocalDateTimeFull() {
        return localDateTimeFull;
    }

    public void setLocalDateTimeFull(String localDateTimeFull) {
        this.localDateTimeFull = localDateTimeFull;
    }

    public String getAifstimeUtc() {
        return aifstimeUtc;
    }

    public void setAifstimeUtc(String aifstimeUtc) {
        this.aifstimeUtc = aifstimeUtc;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getApparentT() {
        return apparentT;
    }

    public void setApparentT(Double apparentT) {
        this.apparentT = apparentT;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public Integer getCloudBaseM() {
        return cloudBaseM;
    }

    public void setCloudBaseM(Integer cloudBaseM) {
        this.cloudBaseM = cloudBaseM;
    }

    public Integer getCloudOktas() {
        return cloudOktas;
    }

    public void setCloudOktas(Integer cloudOktas) {
        this.cloudOktas = cloudOktas;
    }

    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public Integer getCloudTypeId() {
        return cloudTypeId;
    }

    public void setCloudTypeId(Integer cloudTypeId) {
        this.cloudTypeId = cloudTypeId;
    }

    public Double getDeltaT() {
        return deltaT;
    }

    public void setDeltaT(Double deltaT) {
        this.deltaT = deltaT;
    }

    public Integer getGustKmh() {
        return gustKmh;
    }

    public void setGustKmh(Integer gustKmh) {
        this.gustKmh = gustKmh;
    }

    public Integer getGustKt() {
        return gustKt;
    }

    public void setGustKt(Integer gustKt) {
        this.gustKt = gustKt;
    }

    public Double getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(Double airTemp) {
        this.airTemp = airTemp;
    }

    public Double getDewpt() {
        return dewpt;
    }

    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    public Double getPress() {
        return press;
    }

    public void setPress(Double press) {
        this.press = press;
    }

    public Double getPressMsl() {
        return pressMsl;
    }

    public void setPressMsl(Double pressMsl) {
        this.pressMsl = pressMsl;
    }

    public Double getPressQnh() {
        return pressQnh;
    }

    public void setPressQnh(Double pressQnh) {
        this.pressQnh = pressQnh;
    }

    public String getPressTend() {
        return pressTend;
    }

    public void setPressTend(String pressTend) {
        this.pressTend = pressTend;
    }

    public String getRainTrace() {
        return rainTrace;
    }

    public void setRainTrace(String rainTrace) {
        this.rainTrace = rainTrace;
    }

    public Integer getRelHum() {
        return relHum;
    }

    public void setRelHum(Integer relHum) {
        this.relHum = relHum;
    }

    public String getSeaState() {
        return seaState;
    }

    public void setSeaState(String seaState) {
        this.seaState = seaState;
    }

    public String getSwellDirWorded() {
        return swellDirWorded;
    }

    public void setSwellDirWorded(String swellDirWorded) {
        this.swellDirWorded = swellDirWorded;
    }

    public Object getSwellHeight() {
        return swellHeight;
    }

    public void setSwellHeight(Object swellHeight) {
        this.swellHeight = swellHeight;
    }

    public Object getSwellPeriod() {
        return swellPeriod;
    }

    public void setSwellPeriod(Object swellPeriod) {
        this.swellPeriod = swellPeriod;
    }

    public String getVisKm() {
        return visKm;
    }

    public void setVisKm(String visKm) {
        this.visKm = visKm;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getWindSpdKmh() {
        return windSpdKmh;
    }

    public void setWindSpdKmh(Integer windSpdKmh) {
        this.windSpdKmh = windSpdKmh;
    }

    public Integer getWindSpdKt() {
        return windSpdKt;
    }

    public void setWindSpdKt(Integer windSpdKt) {
        this.windSpdKt = windSpdKt;
    }

}
