package com.anonymous.olamap


// Not using this Right now
data class DirectionsResponse(
    val status: String,
    val geocoded_waypoints: List<GeocodedWaypoint>,
    val routes: List<Route>
)

data class GeocodedWaypoint(
    val geocoder_status: String,
    val place_id: String,
    val types: List<String>
)

data class Route(
    val summary: String,
    val legs: List<Leg>,
    val overview_polyline: String,
    val travel_advisory: String,
    val bounds: Map<String, Any>,  // Assuming bounds can be a dynamic object
    val copyrights: String,
    val warnings: List<String>
)

data class Leg(
    val steps: List<Step>,
    val distance: Int,
    val readable_distance: String,
    val duration: Int,
    val readable_duration: String,
    val start_location: Location,
    val end_location: Location,
    val start_address: String,
    val end_address: String
)

data class Step(
    val instructions: String,
    val distance: Int,
    val readable_distance: String,
    val maneuver: String,
    val duration: Int,
    val readable_duration: String,
    val start_location: Location,
    val end_location: Location,
    val bearing_before: Int,
    val bearing_after: Int
)

data class Location(
    val lat: Double,
    val lng: Double
)
