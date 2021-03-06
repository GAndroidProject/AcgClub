package com.rabtman.acgnews.mvp.model.jsoup;

import android.os.Parcel;
import android.os.Parcelable;
import com.fcannizzaro.jsoup.annotations.interfaces.Attr;
import com.fcannizzaro.jsoup.annotations.interfaces.Selector;
import com.fcannizzaro.jsoup.annotations.interfaces.Text;

/**
 * @author Rabtman
 */
@Selector("div.article-list ul li")
public class ZeroFiveNews implements Parcelable {

  public static final Creator<ZeroFiveNews> CREATOR = new Creator<ZeroFiveNews>() {
    @Override
    public ZeroFiveNews createFromParcel(Parcel source) {
      return new ZeroFiveNews(source);
    }

    @Override
    public ZeroFiveNews[] newArray(int size) {
      return new ZeroFiveNews[size];
    }
  };
  @Attr(query = "a img", attr = "src")
  private String imgUrl;
  @Text("div div h3 a")
  private String title;
  @Text("div div div.p-row")
  private String description;
  @Text("div div div span")
  private String dateTime;
  @Attr(query = "a", attr = "href")
  private String contentLink;

  public ZeroFiveNews() {
  }

  protected ZeroFiveNews(Parcel in) {
    this.imgUrl = in.readString();
    this.title = in.readString();
    this.description = in.readString();
    this.dateTime = in.readString();
    this.contentLink = in.readString();
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public String getContentLink() {
    return contentLink;
  }

  public void setContentLink(String contentLink) {
    this.contentLink = contentLink;
  }

  @Override
  public String toString() {
    return "ZeroFiveNews{" +
        "imgUrl='" + imgUrl + '\'' +
        ", title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", dateTime='" + dateTime + '\'' +
        ", contentLink='" + contentLink + '\'' +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.imgUrl);
    dest.writeString(this.title);
    dest.writeString(this.description);
    dest.writeString(this.dateTime);
    dest.writeString(this.contentLink);
  }
}
