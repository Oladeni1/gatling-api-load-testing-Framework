var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1353",
        "ok": "353",
        "ko": "1000"
    },
    "minResponseTime": {
        "total": "249",
        "ok": "398",
        "ko": "249"
    },
    "maxResponseTime": {
        "total": "58840",
        "ok": "56673",
        "ko": "58840"
    },
    "meanResponseTime": {
        "total": "19642",
        "ok": "12449",
        "ko": "22182"
    },
    "standardDeviation": {
        "total": "17929",
        "ok": "16946",
        "ko": "17573"
    },
    "percentiles1": {
        "total": "17557",
        "ok": "682",
        "ko": "21133"
    },
    "percentiles2": {
        "total": "32097",
        "ok": "21669",
        "ko": "34858"
    },
    "percentiles3": {
        "total": "53378",
        "ok": "50425",
        "ko": "53878"
    },
    "percentiles4": {
        "total": "57293",
        "ok": "54561",
        "ko": "57685"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 183,
    "percentage": 14
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 170,
    "percentage": 13
},
    "group4": {
    "name": "failed",
    "count": 1000,
    "percentage": 74
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.5",
        "ok": "5.348",
        "ko": "15.152"
    }
},
contents: {
"req_correlation--ge-91132": {
        type: "REQUEST",
        name: "Correlation- Get all users",
path: "Correlation- Get all users",
pathFormatted: "req_correlation--ge-91132",
stats: {
    "name": "Correlation- Get all users",
    "numberOfRequests": {
        "total": "1000",
        "ok": "353",
        "ko": "647"
    },
    "minResponseTime": {
        "total": "398",
        "ok": "398",
        "ko": "7385"
    },
    "maxResponseTime": {
        "total": "58840",
        "ok": "56673",
        "ko": "58840"
    },
    "meanResponseTime": {
        "total": "22660",
        "ok": "12449",
        "ko": "28232"
    },
    "standardDeviation": {
        "total": "16625",
        "ok": "16946",
        "ko": "13511"
    },
    "percentiles1": {
        "total": "20998",
        "ok": "682",
        "ko": "25223"
    },
    "percentiles2": {
        "total": "33807",
        "ok": "21669",
        "ko": "36712"
    },
    "percentiles3": {
        "total": "53398",
        "ok": "50425",
        "ko": "54497"
    },
    "percentiles4": {
        "total": "57349",
        "ok": "54561",
        "ko": "57695"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 183,
    "percentage": 18
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 170,
    "percentage": 17
},
    "group4": {
    "name": "failed",
    "count": 647,
    "percentage": 65
},
    "meanNumberOfRequestsPerSecond": {
        "total": "15.152",
        "ok": "5.348",
        "ko": "9.803"
    }
}
    },"req_correlation--ge-e220e": {
        type: "REQUEST",
        name: "Correlation- Get specific user",
path: "Correlation- Get specific user",
pathFormatted: "req_correlation--ge-e220e",
stats: {
    "name": "Correlation- Get specific user",
    "numberOfRequests": {
        "total": "353",
        "ok": "0",
        "ko": "353"
    },
    "minResponseTime": {
        "total": "249",
        "ok": "-",
        "ko": "249"
    },
    "maxResponseTime": {
        "total": "58342",
        "ok": "-",
        "ko": "58342"
    },
    "meanResponseTime": {
        "total": "11093",
        "ok": "-",
        "ko": "11093"
    },
    "standardDeviation": {
        "total": "18713",
        "ok": "-",
        "ko": "18713"
    },
    "percentiles1": {
        "total": "348",
        "ok": "-",
        "ko": "348"
    },
    "percentiles2": {
        "total": "27210",
        "ok": "-",
        "ko": "27210"
    },
    "percentiles3": {
        "total": "52740",
        "ok": "-",
        "ko": "52740"
    },
    "percentiles4": {
        "total": "57224",
        "ok": "-",
        "ko": "57224"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 353,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.348",
        "ok": "-",
        "ko": "5.348"
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
