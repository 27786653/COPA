#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.customer.valueobject;

/**
 * SourceType
 *
 * @author Frank Zhang
 * @date 2018-01-08 11:09 AM
 */
public enum SourceType {
    AD, //Advertisement 广告
    WB, // Web site 网站
    RFQ; // Request For Quota 询盘
}
