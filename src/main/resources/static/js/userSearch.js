$(document).ready(function() {
	$(".table").DataTable({
		"ordering" : true,
		"searching" : true,
		"paging" : true,
		"columnDefs" : [ {/* 
		                        "targets": 5,
		                        "orderData": [5,1], */

			"searchable" : false,
			"visible" : true
		} ],
		// Ordering by Percentile - Primary Sort and then by FirstName - Secondary Sort
		"order" : [ [ 5, 'desc' ], [ 1, 'asc' ] ]
	});
});
