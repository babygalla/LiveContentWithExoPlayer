package com.example.tvview.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.media.tv.TvContract;
import android.text.TextUtils;

import java.io.Serializable;

public class TVChannel implements Serializable {

    private static final long INVALID_CHANNEL_ID = -1;

    private long mId;
    private String mPackageName;
    private String mInputId;
    private String mType;
    private String mServiceType;
    private long mOriginalNetworkId;
    private int mTransportStreamId;
    private long mServiceId;
    private String mDisplayNumber;
    private String mDisplayName;
    private String mNetworkAffiliation;
    private String mDescription;
    private String mVideoFormat;
    private int mBrowsable;
    private int mSearchable;
    private String mChannelLogo;

    private String drmLicence;
    private boolean isDRMProtected;

    private byte[] mInternalProviderData;

    private int mAppLinkColor;
    private String mAppLinkIconUri;
    private String mAppLinkIntentUri;
    private String mAppLinkPosterArtUri;
    private String mAppLinkText;

    private String mLCN;
    private int favourite;
    private int favouritevalue;
    private int mHideValue;
    private int mDeleteValue;
    private String mAliasName;
    private int mBouquetName;
    private String mBouquetValue;
    private String mRecentlyWatched;
    private String mGenre;
    private String mCatchup;
    private String mChannelTypeDetail;

    private String mCurrentProgramTitle;
    private String mCurrentProgramPoster;
    public TVChannel(String mDisplayName) {
        this.mDisplayName = mDisplayName;
    }

    public TVChannel() {
    }

    public String getCurrentProgramTitle() {
        return mCurrentProgramTitle;
    }
    public void setCurrentProgramTitle(String mCurrentProgramTitle) {
        this.mCurrentProgramTitle = mCurrentProgramTitle;
    }
    public String getCurrentProgramPoster() {
        return mCurrentProgramPoster;
    }
    public void setCurrentProgramPoster(String mCurrentProgramPoster) {
        this.mCurrentProgramPoster = mCurrentProgramPoster;
    }
    public String getmCatchup() {
        return mCatchup;
    }

    public void setmCatchup(String mCatchup) {
        this.mCatchup = mCatchup;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public String getmPackageName() {
        return mPackageName;
    }

    public void setmPackageName(String mPackageName) {
        this.mPackageName = mPackageName;
    }

    public String getmInputId() {
        return mInputId;
    }

    public void setmInputId(String mInputId) {
        this.mInputId = mInputId;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmServiceType() {
        return mServiceType;
    }

    public void setmServiceType(String mServiceType) {
        this.mServiceType = mServiceType;
    }

    public long getmOriginalNetworkId() {
        return mOriginalNetworkId;
    }

    public void setmOriginalNetworkId(long mOriginalNetworkId) {
        this.mOriginalNetworkId = mOriginalNetworkId;
    }

    public int getmTransportStreamId() {
        return mTransportStreamId;
    }

    public void setmTransportStreamId(int mTransportStreamId) {
        this.mTransportStreamId = mTransportStreamId;
    }

    public String getDrmLicence() {
        return drmLicence;
    }

    public void setDrmLicence(String drmLicence) {
        this.drmLicence = drmLicence;
    }

    public boolean isDRMProtected() {
        return isDRMProtected;
    }

    public void setDRMProtected(boolean DRMProtected) {
        isDRMProtected = DRMProtected;
    }


    public long getmServiceId() {
        return mServiceId;
    }

    public void setmServiceId(long mServiceId) {
        this.mServiceId = mServiceId;
    }

    public String getmDisplayNumber() {
        return mDisplayNumber;
    }

    public void setmDisplayNumber(String mDisplayNumber) {
        this.mDisplayNumber = mDisplayNumber;
    }

    public String getmDisplayName() {
        return mDisplayName;
    }

    public void setmDisplayName(String mDisplayName) {
        this.mDisplayName = mDisplayName;
    }

    public String getmNetworkAffiliation() {
        return mNetworkAffiliation;
    }

    public void setmNetworkAffiliation(String mNetworkAffiliation) {
        this.mNetworkAffiliation = mNetworkAffiliation;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmVideoFormat() {
        return mVideoFormat;
    }

    public void setmVideoFormat(String mVideoFormat) {
        this.mVideoFormat = mVideoFormat;
    }

    public String getmChannelLogo() {
        return mChannelLogo;
    }

    public void setmChannelLogo(String mChannelLogo) {
        this.mChannelLogo = mChannelLogo;
    }

    public int getmBrowsable() {
        return mBrowsable;
    }

    public void setmBrowsable(int mBrowsable) {
        this.mBrowsable = mBrowsable;
    }

    public int getmSearchable() {
        return mSearchable;
    }

    public void setmSearchable(int mSearchable) {
        this.mSearchable = mSearchable;
    }


    public void setmInternalProviderData(byte[] mInternalProviderData) {
        this.mInternalProviderData = mInternalProviderData;
    }


    public int getmAppLinkColor() {
        return mAppLinkColor;
    }

    public void setmAppLinkColor(int mAppLinkColor) {
        this.mAppLinkColor = mAppLinkColor;
    }

    public String getmAppLinkIconUri() {
        return mAppLinkIconUri;
    }

    public void setmAppLinkIconUri(String mAppLinkIconUri) {
        this.mAppLinkIconUri = mAppLinkIconUri;
    }

    public String getmAppLinkPosterArtUri() {
        return mAppLinkPosterArtUri;
    }

    public void setmAppLinkPosterArtUri(String mAppLinkPosterArtUri) {
        this.mAppLinkPosterArtUri = mAppLinkPosterArtUri;
    }

    public String getmAppLinkIntentUri() {
        return mAppLinkIntentUri;
    }

    public void setmAppLinkIntentUri(String mAppLinkIntentUri) {
        this.mAppLinkIntentUri = mAppLinkIntentUri;
    }

    public String getmAppLinkText() {
        return mAppLinkText;
    }

    public void setmAppLinkText(String mAppLinkText) {
        this.mAppLinkText = mAppLinkText;
    }

    public void setmLCN(String mLCN) {
        this.mLCN = mLCN;
    }

    public String getmLCN() {
        return mLCN;
    }

    public void setFavourite(int favourite) {
        this.favourite = favourite;
    }

    public int getFavourite() {
        return favourite;
    }

    public void setFavouritevalue(int favouritevalue) {
        this.favouritevalue = favouritevalue;
    }

    public int getFavouritevalue() {
        return favouritevalue;
    }

    public int getmHideValue() {
        return mHideValue;
    }

    public void setmHideValue(int mHideValue) {
        this.mHideValue = mHideValue;
    }

    public int getmDeleteValue() {
        return mDeleteValue;
    }

    public void setmDeleteValue(int mDeleteValue) {
        this.mDeleteValue = mDeleteValue;
    }

    public String getmAliasName() {
        return mAliasName;
    }

    public void setmAliasName(String mAliasName) {
        this.mAliasName = mAliasName;
    }

    public int getmBouquetName() {
        return mBouquetName;
    }

    public void setmBouquetName(int mBouquetName) {
        this.mBouquetName = mBouquetName;
    }

    public String getmBouquetValue() {
        return mBouquetValue;
    }

    public void setmBouquetValue(String mBouquetValue) {
        this.mBouquetValue = mBouquetValue;
    }

    public String getmRecentlyWatched() {
        return mRecentlyWatched;
    }

    public void setmRecentlyWatched(String mRecentlyWatched) {
        this.mRecentlyWatched = mRecentlyWatched;
    }

    public static final String[] PROJECTION = {
            TvContract.Channels._ID,
            TvContract.Channels.COLUMN_PACKAGE_NAME,
            TvContract.Channels.COLUMN_INPUT_ID,
            TvContract.Channels.COLUMN_DISPLAY_NAME,
            TvContract.Channels.COLUMN_DESCRIPTION,
            TvContract.Channels.COLUMN_APP_LINK_COLOR,
            TvContract.Channels.COLUMN_APP_LINK_ICON_URI,
            TvContract.Channels.COLUMN_APP_LINK_INTENT_URI,
            TvContract.Channels.COLUMN_APP_LINK_POSTER_ART_URI,
            TvContract.Channels.COLUMN_APP_LINK_TEXT,
    };

    /**
     * @return The fields of the Channel in the ContentValues format to be easily inserted into the
     * TV Input Framework database.
     * @hide
     */
    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        if (mId != INVALID_CHANNEL_ID) {
            values.put(TvContract.Channels._ID, mId);
        }
        if (!TextUtils.isEmpty(mPackageName)) {
            values.put(TvContract.Channels.COLUMN_PACKAGE_NAME, mPackageName);
        } else {
            values.putNull(TvContract.Channels.COLUMN_PACKAGE_NAME);
        }
        if (!TextUtils.isEmpty(mInputId)) {
            values.put(TvContract.Channels.COLUMN_INPUT_ID, mInputId);
        } else {
            values.putNull(TvContract.Channels.COLUMN_INPUT_ID);
        }
        if (!TextUtils.isEmpty(mType)) {
            values.put(TvContract.Channels.COLUMN_TYPE, mType);
        } else {
            values.putNull(TvContract.Channels.COLUMN_TYPE);
        }
        if (!TextUtils.isEmpty(mDisplayNumber)) {
            values.put(TvContract.Channels.COLUMN_DISPLAY_NUMBER, mDisplayNumber);
        } else {
            values.putNull(TvContract.Channels.COLUMN_DISPLAY_NUMBER);
        }
        if (!TextUtils.isEmpty(mDisplayName)) {
            values.put(TvContract.Channels.COLUMN_DISPLAY_NAME, mDisplayName);
        } else {
            values.putNull(TvContract.Channels.COLUMN_DISPLAY_NAME);
        }
        if (!TextUtils.isEmpty(mDescription)) {
            values.put(TvContract.Channels.COLUMN_DESCRIPTION, mDescription);
        } else {
            values.putNull(TvContract.Channels.COLUMN_DESCRIPTION);
        }
        if (!TextUtils.isEmpty(mVideoFormat)) {
            values.put(TvContract.Channels.COLUMN_VIDEO_FORMAT, mVideoFormat);
        } else {
            values.putNull(TvContract.Channels.COLUMN_VIDEO_FORMAT);
        }
        if (mInternalProviderData != null && mInternalProviderData.length > 0) {
            values.put(TvContract.Channels.COLUMN_INTERNAL_PROVIDER_DATA, mInternalProviderData);
        } else {
            values.putNull(TvContract.Channels.COLUMN_INTERNAL_PROVIDER_DATA);
        }
        values.put(TvContract.Channels.COLUMN_ORIGINAL_NETWORK_ID, mOriginalNetworkId);
        values.put(TvContract.Channels.COLUMN_TRANSPORT_STREAM_ID, mTransportStreamId);
        values.put(TvContract.Channels.COLUMN_SERVICE_ID, mServiceId);
        values.put(TvContract.Channels.COLUMN_NETWORK_AFFILIATION, mNetworkAffiliation);
        values.put(TvContract.Channels.COLUMN_BROWSABLE, mBrowsable);
        values.put(TvContract.Channels.COLUMN_SEARCHABLE, mSearchable);
        values.put(TvContract.Channels.COLUMN_SERVICE_TYPE, mServiceType);
        values.put(TvContract.Channels.COLUMN_APP_LINK_COLOR, mAppLinkColor);
        if (!TextUtils.isEmpty(mAppLinkText)) {
            values.put(TvContract.Channels.COLUMN_APP_LINK_TEXT, mAppLinkText);
        } else {
            values.putNull(TvContract.Channels.COLUMN_APP_LINK_TEXT);
        }
        if (!TextUtils.isEmpty(mAppLinkIconUri)) {
            values.put(TvContract.Channels.COLUMN_APP_LINK_ICON_URI, mAppLinkIconUri);
        } else {
            values.putNull(TvContract.Channels.COLUMN_APP_LINK_ICON_URI);
        }
        if (!TextUtils.isEmpty(mAppLinkPosterArtUri)) {
            values.put(TvContract.Channels.COLUMN_APP_LINK_POSTER_ART_URI,
                    mAppLinkPosterArtUri);
        } else {
            values.putNull(TvContract.Channels.COLUMN_APP_LINK_POSTER_ART_URI);
        }
        if (!TextUtils.isEmpty(mAppLinkIntentUri)) {
            values.put(TvContract.Channels.COLUMN_APP_LINK_INTENT_URI, mAppLinkIntentUri);
        } else {
            values.putNull(TvContract.Channels.COLUMN_APP_LINK_INTENT_URI);
        }
        return values;
    }

    public static TVChannel fromCursor(Cursor cursor) {

        Builder builder = new Builder();
        //String pkgname = cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_PACKAGE_NAME));
        builder.withMId(cursor.getInt(cursor.getColumnIndex(TvContract.Channels._ID)));
        builder.withMPackageName(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_PACKAGE_NAME)));
        builder.withMInputId(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_INPUT_ID)));
        builder.withMType(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_TYPE)));
        builder.withMServiceType(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_SERVICE_TYPE)));
        builder.withMOriginalNetworkId(cursor.getLong(cursor.getColumnIndex(TvContract.Channels.COLUMN_ORIGINAL_NETWORK_ID)));
        builder.withMTransportStreamId(cursor.getInt(cursor.getColumnIndex(TvContract.Channels.COLUMN_TRANSPORT_STREAM_ID)));
        builder.withMServiceId(cursor.getLong(cursor.getColumnIndex(TvContract.Channels.COLUMN_SERVICE_ID)));
        builder.withMDisplayNumber(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_DISPLAY_NUMBER)));
        builder.withMDisplayName(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_DISPLAY_NAME)));
        builder.withMNetworkAffiliation(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_NETWORK_AFFILIATION)));
        builder.withMDescription(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_DESCRIPTION)));
        builder.withMVideoFormat(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_VIDEO_FORMAT)));
        builder.withMBrowsable(cursor.getInt(cursor.getColumnIndex(TvContract.Channels.COLUMN_BROWSABLE)));
        builder.withMSearchable(cursor.getInt(cursor.getColumnIndex(TvContract.Channels.COLUMN_SEARCHABLE)));
        builder.withMInternalProviderData(cursor.getBlob(cursor.getColumnIndex(TvContract.Channels.COLUMN_INTERNAL_PROVIDER_DATA)));
        builder.withMAppLinkColor(cursor.getInt(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_COLOR)));
        builder.withMAppLinkIconUri(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_ICON_URI)));
        builder.withMAppLinkIntentUri(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_INTENT_URI)));
        builder.withMAppLinkPosterArtUri(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_POSTER_ART_URI)));
        builder.withMAppLinkText(cursor.getString(cursor.getColumnIndex(TvContract.Channels.COLUMN_APP_LINK_TEXT)));
        return builder.build();

    }


    public static final class Builder {
        private long mId;
        private String mPackageName;
        private String mInputId;
        private String mType;
        private String mServiceType;
        private long mOriginalNetworkId;
        private int mTransportStreamId;
        private long mServiceId;
        private String mDisplayNumber;
        private String mDisplayName;
        private String mNetworkAffiliation;
        private String mDescription;
        private String mVideoFormat;
        private String mChannelLogo;
        private int mBrowsable;
        private int mSearchable;
        private byte[] mInternalProviderData;
        private int mAppLinkColor;
        private String mAppLinkIconUri;
        private String mAppLinkIntentUri;
        private String mAppLinkPosterArtUri;
        private String mAppLinkText;
        private String mLCN;
        private String drmLicence;
        private int favourite;
        private int favouritevalue;
        private int mHideValue;
        private int mDeleteValue;
        private String mAliasName;
        private int mBouquetName;

        private String mBouquetValue;
        private boolean isDRMProtected;

        private String mRecentlyWatched;
        private String mGenre;
        private String mCatchup;
        private String mChannelTypeDetail;


        private Builder() {
        }

        public static Builder aTVChannel() {
            return new Builder();
        }

        public Builder withMId(long mId) {
            this.mId = mId;
            return this;
        }

        public Builder withMPackageName(String mPackageName) {
            this.mPackageName = mPackageName;
            return this;
        }

        public Builder withMInputId(String mInputId) {
            this.mInputId = mInputId;
            return this;
        }

        public Builder withMType(String mType) {
            this.mType = mType;
            return this;
        }

        public Builder withMServiceType(String mServiceType) {
            this.mServiceType = mServiceType;
            return this;
        }

        public Builder withMOriginalNetworkId(long mOriginalNetworkId) {
            this.mOriginalNetworkId = mOriginalNetworkId;
            return this;
        }

        public Builder withMTransportStreamId(int mTransportStreamId) {
            this.mTransportStreamId = mTransportStreamId;
            return this;
        }

        public Builder withMServiceId(long mServiceId) {
            this.mServiceId = mServiceId;
            return this;
        }

        public Builder withMDisplayNumber(String mDisplayNumber) {
            this.mDisplayNumber = mDisplayNumber;
            return this;
        }

        public Builder withMDisplayName(String mDisplayName) {
            this.mDisplayName = mDisplayName;
            return this;
        }

        public Builder withMNetworkAffiliation(String mNetworkAffiliation) {
            this.mNetworkAffiliation = mNetworkAffiliation;
            return this;
        }

        public Builder withMDescription(String mDescription) {
            this.mDescription = mDescription;
            return this;
        }

        public Builder withMVideoFormat(String mVideoFormat) {
            this.mVideoFormat = mVideoFormat;
            return this;
        }

        public Builder withMChannelLogo(String mChannelLogo) {
            this.mChannelLogo = mChannelLogo;
            return this;
        }

        public Builder withMBrowsable(int mBrowsable) {
            this.mBrowsable = mBrowsable;
            return this;
        }

        public Builder withMSearchable(int mSearchable) {
            this.mSearchable = mSearchable;
            return this;
        }

        public Builder withMInternalProviderData(byte[] mInternalProviderData) {
            this.mInternalProviderData = mInternalProviderData;
            return this;
        }

        public Builder withMAppLinkColor(int mAppLinkColor) {
            this.mAppLinkColor = mAppLinkColor;
            return this;
        }

        public Builder withMAppLinkIconUri(String mAppLinkIconUri) {
            this.mAppLinkIconUri = mAppLinkIconUri;
            return this;
        }

        public Builder withMAppLinkIntentUri(String mAppLinkIntentUri) {
            this.mAppLinkIntentUri = mAppLinkIntentUri;
            return this;
        }

        public Builder withMAppLinkPosterArtUri(String mAppLinkPosterArtUri) {
            this.mAppLinkPosterArtUri = mAppLinkPosterArtUri;
            return this;
        }

        public Builder withMAppLinkText(String mAppLinkText) {
            this.mAppLinkText = mAppLinkText;
            return this;
        }

        public Builder withMLCN(String mLCN) {
            this.mLCN = mLCN;
            return this;
        }

        public Builder withFavourite(int favourite) {
            this.favourite = favourite;
            return this;
        }

        public Builder withFavouritevalue(int favouritevalue) {
            this.favouritevalue = favouritevalue;
            return this;
        }

        public Builder withHideValue(int hideValue) {
            this.mHideValue = hideValue;
            return this;
        }

        public Builder withDeleteValue(int mDeleteValue) {
            this.mDeleteValue = mDeleteValue;
            return this;
        }

        public Builder withAliasNameValue(String mAliasName) {
            this.mAliasName = mAliasName;
            return this;
        }


        public Builder withBouquetValue(String bouquetValue) {
            this.mBouquetValue = bouquetValue;
            return this;
        }

        public Builder withBoquetNameValue(int mBouquetName) {
            this.mBouquetName = mBouquetName;
            return this;
        }

        public Builder withDRMLicence(String drmLicence) {
            this.drmLicence = drmLicence;
            return this;
        }

        public Builder withDRMStatus(boolean isDRMProtected) {
            this.isDRMProtected = isDRMProtected;
            return this;
        }

        public Builder withRecentlyWatched(String isRecentlyWatched) {
            this.mRecentlyWatched = isRecentlyWatched;
            return this;
        }

        public Builder withGenre(String isgenre) {
            this.mGenre = isgenre;
            return this;
        }

        public Builder withCatchup(String isCatchup) {
            this.mCatchup = isCatchup;
            return this;
        }

        public Builder withChannelTypeDetials(String channelTypeDetail) {
            this.mChannelTypeDetail = channelTypeDetail;
            return this;
        }

        public TVChannel build() {
            TVChannel tVChannel = new TVChannel(mDisplayName);
            tVChannel.mType = this.mType;
            tVChannel.mAppLinkIconUri = this.mAppLinkIconUri;
            tVChannel.mInputId = this.mInputId;
            tVChannel.mInternalProviderData = this.mInternalProviderData;
            tVChannel.mServiceId = this.mServiceId;
            tVChannel.mPackageName = this.mPackageName;
            tVChannel.mServiceType = this.mServiceType;
            tVChannel.mTransportStreamId = this.mTransportStreamId;
            tVChannel.favouritevalue = this.favouritevalue;
            tVChannel.favourite = this.favourite;
            tVChannel.mLCN = this.mLCN;
            tVChannel.mId = this.mId;
            tVChannel.mOriginalNetworkId = this.mOriginalNetworkId;
            tVChannel.mAppLinkIntentUri = this.mAppLinkIntentUri;
            tVChannel.mAppLinkPosterArtUri = this.mAppLinkPosterArtUri;
            tVChannel.mBrowsable = this.mBrowsable;
            tVChannel.mSearchable = this.mSearchable;
            tVChannel.mVideoFormat = this.mVideoFormat;
            tVChannel.mDescription = this.mDescription;
            tVChannel.mDisplayNumber = this.mDisplayNumber;
            tVChannel.mAppLinkColor = this.mAppLinkColor;
            tVChannel.mNetworkAffiliation = this.mNetworkAffiliation;
            tVChannel.mChannelLogo = this.mChannelLogo;
            tVChannel.mAppLinkText = this.mAppLinkText;
            tVChannel.mHideValue = this.mHideValue;
            tVChannel.mDeleteValue = this.mDeleteValue;
            tVChannel.mAliasName = this.mAliasName;
            tVChannel.mBouquetName = this.mBouquetName;
            tVChannel.mBouquetValue = this.mBouquetValue;
            tVChannel.drmLicence = this.drmLicence;
            tVChannel.isDRMProtected = this.isDRMProtected;
            tVChannel.mRecentlyWatched = this.mRecentlyWatched;
            tVChannel.mGenre = this.mGenre;
            tVChannel.mChannelTypeDetail = this.mChannelTypeDetail;

            return tVChannel;
        }


    }
}
