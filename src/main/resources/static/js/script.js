// QualityController Mock Actions

function recordInspection() {
    // Fetches the data from the HTML form to match the QualityInspection Entity
    const orderId = document.getElementById('orderId').value;
    const sampleSize = document.getElementById('sampleSize').value;
    const defectCount = document.getElementById('defectCount').value;

    if(!orderId || !sampleSize || !defectCount) {
        alert("Please fill in all inspection fields.");
        return;
    }

    // In the future, this will POST to /api/quality/recordInspection
    console.log(`Recording Inspection: Order ${orderId}, Sample: ${sampleSize}, Defects: ${defectCount}`);
    alert(`Inspection Recorded successfully for Order ${orderId}!`);
    document.getElementById('inspectionForm').reset();
}

function logDefect() {
    const orderId = document.getElementById('orderId').value;
    if(!orderId) {
        alert("Please enter an Order ID to log a defect against.");
        return;
    }
    
    // In the future, this will POST to /api/quality/logDefect
    alert(`Defect logging initiated for Order ID: ${orderId}. Routing to non-conformance workflow.`);
}

function approveBatch() {
    // In the future, this will POST to /api/quality/approveBatch
    const confirmApprove = confirm("Are you sure you want to APPROVE the selected batch?");
    if(confirmApprove) {
        alert("Batch Approved successfully.");
    }
}

function rejectBatch() {
    // In the future, this will POST to /api/quality/rejectBatch
    const confirmReject = confirm("WARNING: Are you sure you want to REJECT the selected batch?");
    if(confirmReject) {
        alert("Batch Rejected. Notifying production team.");
    }
}