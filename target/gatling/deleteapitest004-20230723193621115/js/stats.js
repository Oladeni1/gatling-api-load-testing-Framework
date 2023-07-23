var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "20",
        "ok": "20",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "98",
        "ok": "98",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "858",
        "ok": "858",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "355",
        "ok": "355",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "289",
        "ok": "289",
        "ko": "-"
    },
    "percentiles1": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "percentiles2": {
        "total": "676",
        "ok": "676",
        "ko": "-"
    },
    "percentiles3": {
        "total": "816",
        "ok": "816",
        "ko": "-"
    },
    "percentiles4": {
        "total": "850",
        "ok": "850",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 18,
    "percentage": 90
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 2,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.818",
        "ok": "1.818",
        "ko": "-"
    }
},
contents: {
"req_update-user-6b160": {
        type: "REQUEST",
        name: "Update User",
path: "Update User",
pathFormatted: "req_update-user-6b160",
stats: {
    "name": "Update User",
    "numberOfRequests": {
        "total": "20",
        "ok": "20",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "98",
        "ok": "98",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "858",
        "ok": "858",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "355",
        "ok": "355",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "289",
        "ok": "289",
        "ko": "-"
    },
    "percentiles1": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "percentiles2": {
        "total": "676",
        "ok": "676",
        "ko": "-"
    },
    "percentiles3": {
        "total": "816",
        "ok": "816",
        "ko": "-"
    },
    "percentiles4": {
        "total": "850",
        "ok": "850",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 18,
    "percentage": 90
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 2,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.818",
        "ok": "1.818",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
