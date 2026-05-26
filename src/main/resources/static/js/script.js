document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector(".factory-form");
    const toast = document.getElementById("toast-notification");
    const statusSelect = document.getElementById("machineStatus");
    const reasonGroup = document.getElementById("reasonGroup");
    const reasonInput = document.getElementById("downtimeReason");

    // Dynamic Shop-Floor Input Rules Logic
    if (statusSelect && reasonGroup && reasonInput) {
        statusSelect.addEventListener("change", () => {
            const selectedStatus = statusSelect.value;

            if (selectedStatus === "BREAKDOWN" || selectedStatus === "MAINTENANCE") {
                // Unhide reason input block and make it a validation requirement
                reasonGroup.classList.remove("hidden");
                reasonInput.setAttribute("required", "true");
            } else {
                // Hide input block and strip data/requirements if state is running or idle
                reasonGroup.classList.add("hidden");
                reasonInput.removeAttribute("required");
                reasonInput.value = ""; 
            }
        });
    }

    // Intercept standard form processing to display dashboard toast alerts
    if (form) {
        form.addEventListener("submit", (e) => {
            /* NOTE: If you are connecting this directly to your Java/Spring or .NET Core 
               backend, comment out `e.preventDefault()` below so the form natively submits via POST.
            */
            e.preventDefault();
            
            // Capture specific heading context title
            const cardHeading = form.closest(".form-card").querySelector("h2").textContent.trim();
            
            showToast(`⚙️ System Event Logged: Completed context for "${cardHeading}"`);
            form.reset();
            
            // Re-hide the conditional reason group post-reset
            if (reasonGroup) {
                reasonGroup.classList.add("hidden");
                reasonInput.removeAttribute("required");
            }
        });
    }

    function showToast(message) {
        if (!toast) return;
        toast.textContent = message;
        toast.classList.remove("hidden");

        setTimeout(() => {
            toast.classList.add("hidden");
        }, 4000);
    }
});