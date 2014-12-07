/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.avfoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.mediatoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVAsynchronousKeyValueLoading/*</implements>*/ {

    /*<ptr>*/public static class AVMetadataItemPtr extends Ptr<AVMetadataItem, AVMetadataItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMetadataItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMetadataItem() {}
    protected AVMetadataItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "identifier")
    public native AVMetadataIdentifier getIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "dataType")
    public native String getDataType();
    @Property(selector = "value")
    public native NSObject getValue();
    @Property(selector = "extraAttributes")
    public native NSDictionary<NSString, ?> getExtraAttributes();
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "numberValue")
    public native NSNumber getNumberValue();
    @Property(selector = "dateValue")
    public native NSDate getDateValue();
    @Property(selector = "dataValue")
    public native NSData getDataValue();
    @Property(selector = "key")
    public native NSString getKey();
    @Property(selector = "commonKey")
    public native String getCommonKey();
    @Property(selector = "keySpace")
    public native String getKeySpace();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Method(selector = "statusOfValueForKey:error:")
    public native AVKeyValueStatus getStatusOfValue(String key, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Method(selector = "loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(NSArray<NSString> keys, @Block Runnable handler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<AVMetadataItem> getMetadataItems(NSArray<AVMetadataItem> metadataItems, NSArray<AVMetadataItem> preferredLanguages);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<?> metadataItemsFromArray$filteredByIdentifier$(NSArray<?> metadataItems, String identifier);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<AVMetadataItem> getMetadataItems(NSArray<AVMetadataItem> metadataItems, AVMetadataItemFilter metadataItemFilter);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "identifierForKey:keySpace:")
    public static native String identifierForKey$keySpace$(NSObject key, String keySpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "keySpaceForIdentifier:")
    public static native String keySpaceForIdentifier$(String identifier);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "keyForIdentifier:")
    public static native NSObject keyForIdentifier$(String identifier);
    @Method(selector = "metadataItemsFromArray:withLocale:")
    public static native NSArray<AVMetadataItem> getMetadataItems(NSArray<AVMetadataItem> metadataItems, NSLocale locale);
    @Method(selector = "metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<AVMetadataItem> getMetadataItems(NSArray<AVMetadataItem> metadataItems, NSObject key, String keySpace);
    /*</methods>*/
}
