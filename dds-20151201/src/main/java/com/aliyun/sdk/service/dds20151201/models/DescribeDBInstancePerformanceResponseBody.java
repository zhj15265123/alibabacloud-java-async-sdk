// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePerformanceResponseBody</p>
 */
public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBInstancePerformanceResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return performanceKeys
     */
    public PerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * The end of the time range to query. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Details about the performance metrics.
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range to query. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBInstancePerformanceResponseBody build() {
            return new DescribeDBInstancePerformanceResponseBody(this);
        } 

    } 

    public static class PerformanceValue extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Value")
        private String value;

        private PerformanceValue(Builder builder) {
            this.date = builder.date;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceValue create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String date; 
            private String value; 

            /**
             * The date and time when the metric value was generated.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * The value of the performance metric.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PerformanceValue build() {
                return new PerformanceValue(this);
            } 

        } 

    }
    public static class PerformanceValues extends TeaModel {
        @NameInMap("PerformanceValue")
        private java.util.List < PerformanceValue> performanceValue;

        private PerformanceValues(Builder builder) {
            this.performanceValue = builder.performanceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceValues create() {
            return builder().build();
        }

        /**
         * @return performanceValue
         */
        public java.util.List < PerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

        public static final class Builder {
            private java.util.List < PerformanceValue> performanceValue; 

            /**
             * PerformanceValue.
             */
            public Builder performanceValue(java.util.List < PerformanceValue> performanceValue) {
                this.performanceValue = performanceValue;
                return this;
            }

            public PerformanceValues build() {
                return new PerformanceValues(this);
            } 

        } 

    }
    public static class PerformanceKey extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("PerformanceValues")
        private PerformanceValues performanceValues;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("ValueFormat")
        private String valueFormat;

        private PerformanceKey(Builder builder) {
            this.key = builder.key;
            this.performanceValues = builder.performanceValues;
            this.unit = builder.unit;
            this.valueFormat = builder.valueFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKey create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return performanceValues
         */
        public PerformanceValues getPerformanceValues() {
            return this.performanceValues;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return valueFormat
         */
        public String getValueFormat() {
            return this.valueFormat;
        }

        public static final class Builder {
            private String key; 
            private PerformanceValues performanceValues; 
            private String unit; 
            private String valueFormat; 

            /**
             * The performance metric.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Details about the performance metric values.
             */
            public Builder performanceValues(PerformanceValues performanceValues) {
                this.performanceValues = performanceValues;
                return this;
            }

            /**
             * The unit of the performance metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The format of the performance metric value. If the performance metric contains multiple fields, the fields are separated with **\&amp;** symbols.
             * <p>
             * 
             * For example, if you query disk usage, the returned **ValueFormat** value is in the **ins_size\&amp;data_size\&amp;log_size** format.
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            public PerformanceKey build() {
                return new PerformanceKey(this);
            } 

        } 

    }
    public static class PerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        private java.util.List < PerformanceKey> performanceKey;

        private PerformanceKeys(Builder builder) {
            this.performanceKey = builder.performanceKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return performanceKey
         */
        public java.util.List < PerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

        public static final class Builder {
            private java.util.List < PerformanceKey> performanceKey; 

            /**
             * PerformanceKey.
             */
            public Builder performanceKey(java.util.List < PerformanceKey> performanceKey) {
                this.performanceKey = performanceKey;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
