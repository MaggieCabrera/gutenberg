package org.wordpress.mobile.ReactNativeAztec;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Event emitted by AztecText native view when full content with cursor is requested by JS
 */
class ReactAztecHtmlWithCursorEvent extends Event<ReactAztecHtmlWithCursorEvent> {

  private static final String EVENT_NAME = "topHTMLWithCursorRequested";

  private String mText;
  private int mCursorPosition;

  public ReactAztecHtmlWithCursorEvent(int viewId, String text, int cursorPosition) {
    super(viewId);
    mText = text;
    mCursorPosition = cursorPosition;
  }

  @Override
  public String getEventName() {
    return EVENT_NAME;
  }

  @Override
  public boolean canCoalesce() {
    return false;
  }

  @Override
  public void dispatch(RCTEventEmitter rctEventEmitter) {
    rctEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
  }

  private WritableMap serializeEventData() {
    WritableMap eventData = Arguments.createMap();
    eventData.putInt("target", getViewTag());
    eventData.putString("text", mText);
    eventData.putInt("cursorPosition", mCursorPosition);
    return eventData;
  }
}
