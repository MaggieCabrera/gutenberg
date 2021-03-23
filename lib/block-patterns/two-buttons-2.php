<?php
/**
 * Two Buttons block pattern.
 *
 * @package WordPress
 */

return array(
	'title'         => __( 'Two buttons' ),
	'content'       => '<!-- wp:buttons {"contentJustification":"center"} -->
	<div class="wp-block-buttons is-content-justification-center"><!-- wp:button {"borderRadius":0} -->
	<div class="wp-block-button"><a class="wp-block-button__link no-border-radius">' . __( 'Our Work' ) . '</a></div>
	<!-- /wp:button -->
	
	<!-- wp:button {"borderRadius":1,"className":"is-style-outline"} -->
	<div class="wp-block-button is-style-outline"><a class="wp-block-button__link" style="border-radius:1px">' . __( 'Where We Are' ) . '</a></div>
	<!-- /wp:button --></div>
	<!-- /wp:buttons -->',
	'viewportWidth' => 500,
	'categories'    => array( 'buttons' ),
	'description'   => _x( 'Two buttons, one filled and one outlined, side by side.', 'Block pattern description' ),
);
