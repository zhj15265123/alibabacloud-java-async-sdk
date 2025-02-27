// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighlightInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeHighlightInfoRequest</p>
 */
public class DescribeHighlightInfoRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Lang")
    @Validation(required = true)
    private String lang;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TraceId")
    @Validation(required = true)
    private String traceId;

    private DescribeHighlightInfoRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.startTime = builder.startTime;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighlightInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<DescribeHighlightInfoRequest, Builder> {
        private String endTime; 
        private String lang; 
        private String startTime; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHighlightInfoRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.startTime = request.startTime;
            this.traceId = request.traceId;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public DescribeHighlightInfoRequest build() {
            return new DescribeHighlightInfoRequest(this);
        } 

    } 

}
